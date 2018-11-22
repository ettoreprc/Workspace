package com.mainpackage.carsfactory;

public class Client {

	public static void main(String[] args) {
//		CarsFactory a = new UrbanCar() ; 
//		a.makeUrbanAutomobile() ; 
		
		Engine e = null ; 
		
		if (args[0].equals("Race"))
			e = new RaceEngine().make() ; 
		else 
			e = new UrbanEngine().make() ; 
		
		System.out.println(args[0]);
	}

}
