package com.bellinfo.batch2.day10.abstractinterfaces;

public class AbstractInterfaceExample {

	public static void main(String[] args) {
		
		System.out.println("*************For Boeing Object With Vechile Reference************************");
		Vechile vechile = new Boeing();
		vechile.modeOfTransportation();
		vechile.typeOfFuel();
		boolean b = vechile.isDriverRequired;
		int count = vechile.minNumberofDrivers;
		
		System.out.println("*************For Boeing with Object  Plane Reference************************");
		
		Plane P = new Boeing();
		P.modeOfTransportation();
		P.typeOfFuel();
		P.speed();
		P.noOfPassengrs();
		

	}

}
