package com.mainpackage.numeri;

import javax.swing.JOptionPane;

public class Foglio {

	public FabbricaNumeri fabbrica ; 
	
	public Foglio (FabbricaNumeri fabbrica ) 
	{
		this.fabbrica = fabbrica  ;
	}
	
	private void scrivi() {
		fabbrica.stampa();
	}
	
	public static void main (String [] args)
	{
		FabbricaNumeri fn = new NumeroDue(); 
		Foglio f = new Foglio (fn.crea()) ; 
		while (true)
		{
			f.scrivi();
			String finito = JOptionPane.showInputDialog("Finito?");
			if (finito.equalsIgnoreCase("SI"))
				break ; 
		}	
	}
	
}
