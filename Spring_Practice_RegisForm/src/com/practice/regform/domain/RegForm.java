package com.practice.regform.domain;

import java.io.Serializable;

public class RegForm implements Serializable {

	private int ID;
	private String FName;
	private String LName;
	private String gender;
	private String phno;
	private String email;
	private String Addr;
	private String City;
	private String State;
	private int pin;

	
	
	
	
	public RegForm() {
		super();
	}

	public RegForm(int iD, String fName, String lName, String gender,
			String phno, String email, String addr, String city, String state,
			int pin) {
		super();
		ID = iD;
		FName = fName;
		LName = lName;
		this.gender = gender;
		this.phno = phno;
		this.email = email;
		Addr = addr;
		City = city;
		State = state;
		this.pin = pin;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "RegForm [ID=" + ID + ", FName=" + FName + ", LName=" + LName
				+ ", gender=" + gender + ", phno=" + phno + ", email=" + email
				+ ", Addr=" + Addr + ", City=" + City + ", State=" + State
				+ ", pin=" + pin + "]";
	}

}
