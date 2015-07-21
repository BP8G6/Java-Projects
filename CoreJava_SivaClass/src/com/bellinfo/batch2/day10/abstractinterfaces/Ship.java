package com.bellinfo.batch2.day10.abstractinterfaces;

public abstract class Ship implements Vechile {

public void modeOfTransportation() {
		
		System.out.println("Mode of Transportation is Air");
	}

	
	public void typeOfFuel() {
		
	System.out.println("Type of Fuel is");	
	}

	abstract void noOfPassengrs();
	abstract void timing();
}
