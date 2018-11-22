package com.mainpackage.carsfactory;

public class RaceCar implements CarsFactory{

	@Override
	public RaceCar makeRaceAutomobile() {
		System.out.println("Race Automobile");
		return this;
	}

	@Override
	public UrbanCar makeUrbanAutomobile() {
		return null;
	}

}
