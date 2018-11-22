package com.mainpackage.carsfactory;

public class UrbanEngine implements Engine {

	@Override
	public Engine make() {
		System.out.println("Urban Engine ");
		return new UrbanEngine() ;
	}


}
