package com.mainpackage.carsfactory;

public class RaceEngine implements Engine {

	@Override
	public Engine make() {
		System.out.println("Race Engine ");
		return new RaceEngine () ;
	}
	
}
