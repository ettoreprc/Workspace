package com.mainpackage.numeri;

public class NumeroTre implements FabbricaNumeri {

	@Override
	public FabbricaNumeri crea() {
		System.out.println("chiamato il metodo crea NumeroTre");
		return new NumeroTre();
	}

	@Override
	public void stampa() {
		System.out.println("* * *");
		System.out.println("* * *");
		System.out.println("* * *");
		System.out.println("* * *");
		System.out.println("* * *");
		System.out.println("* * *");
		
	}

}
