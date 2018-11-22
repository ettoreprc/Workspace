package com.mainpackage.carsfactory;

public class UrbanCockpit implements Cockpit {

	@Override
	public Cockpit make() {
		System.out.println("Urban Cockpit");
		return this;
	}

}
