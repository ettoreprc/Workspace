package com.mainpackage.numeri;

public class NumeroUno implements FabbricaNumeri {

	@Override
	public FabbricaNumeri crea() {
		System.out.println("chiamato il metodo crea NumeroUno");
		return new NumeroUno();
	}

	@Override
	public void stampa() {
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
	}

}
