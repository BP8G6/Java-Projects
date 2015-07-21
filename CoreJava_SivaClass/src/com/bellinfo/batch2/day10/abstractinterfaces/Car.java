package com.bellinfo.batch2.day10.abstractinterfaces;

public abstract class Car implements Vechile {

public void modeOfTransportation() {
		
		System.out.println("Mode of Transportation is Air");
	}

	
	public void typeOfFuel() {
		
	System.out.println("Type of Fuel is Car Fuel");	
	}

	abstract void noOfPassengrs();
	abstract void milage();
}
