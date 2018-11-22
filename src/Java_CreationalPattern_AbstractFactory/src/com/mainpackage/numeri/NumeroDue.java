package com.mainpackage.numeri;

public class NumeroDue implements FabbricaNumeri {

	@Override
	public FabbricaNumeri crea() {
		System.out.println("chiamato il metodo crea NumeroDue");
		return new NumeroDue();
	}

	@Override
	public void stampa() {
		System.out.println("* *");
		System.out.println("* *");
		System.out.println("* *");
		System.out.println("* *");
		System.out.println("* *");
		System.out.println("* *");
		
	}

}
