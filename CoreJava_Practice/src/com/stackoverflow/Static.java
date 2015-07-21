package com.stackoverflow;

public class Static {
	private static String owner;
	private static int rent;
	private String car;

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public static int getRent() {
		return rent;
	}

	public static void setRent(int rent) {
		Static.rent = rent;
	}

	public static String getOwner() {
		return owner;
	}

	public static void setOwner(String owner) {
		Static.owner = owner;
	}

		

	}


