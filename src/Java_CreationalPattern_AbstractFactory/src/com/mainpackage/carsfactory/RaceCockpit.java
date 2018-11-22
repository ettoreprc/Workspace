package com.mainpackage.carsfactory;

public class RaceCockpit implements Cockpit {

	@Override
	public Cockpit make() {
		System.out.println("Race Cockpit");
		return this;
	}

}
