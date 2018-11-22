package com.mainpackage.carsfactory;

public class UrbanCar implements CarsFactory{

	@Override
	public RaceCar makeRaceAutomobile() {
		return null;
	}

	@Override
	public UrbanCar makeUrbanAutomobile() {
		System.out.println("Urban Automobile");
		return this;
	}

}
