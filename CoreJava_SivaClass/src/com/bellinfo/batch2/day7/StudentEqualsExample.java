package com.bellinfo.batch2.day7;

public class StudentEqualsExample {

	public static void main(String[] args) {
		
		Address addr= new Address();
		addr.setSuitNo(123);
		addr.setStreetName("Sterling");
		addr.setCity("Herdon");
		addr.setPinCode(20170);
		
		Address addr1= new Address();
		addr1.setSuitNo(456);
		addr1.setStreetName("San Moritz");
		addr1.setCity("Herdon");
		addr1.setPinCode(20170);

		Student std = new Student();
		std.setName("BalaKrishna");
		std.setRollNumber(16177831);
		std.setAddress(addr);
		
		Student std1 = new Student();
		std1.setName("BalaKrishna");
		std1.setRollNumber(16177831);
		std1.setAddress(addr1);
		
		
		//Arrays Concept
		Student[] student = new Student[2];
		student[0]=std;
		student[1]=std1;
		Student STD =null;
		System.out.println("Retriving From Array...........!");
		for(int i=0;i<2;i++){
		
			STD = student[i];
			System.out.println(STD);
		}
		
		
		if(std.equals(std1))
		{
			System.out.println("Yes, Both Students are Same. "+" stud1"+ std.toString()+ " Stud2"+ std1.toString());
		}
		else
			System.out.println("No, Both Students are not same. "+" stud1"+ std.toString()+ " Stud2"+ std1.toString());
	}

}

class Student {
	private int rollNumber;
	private String Name;
	private Address address;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean equals(Object obj){
		if(obj instanceof Student)
		{
			Student studObj =(Student)obj;
			if(this.rollNumber==studObj.getRollNumber() && 
					this.Name.equals(studObj.getName()) && //equals from string class
					this.address.equals(studObj.getAddress())) // equals from Address class
				return true;
		}
			
		return false;
			}
	
	public String toString()
	{
		return "Name : "+Name+" RollNumber : "+rollNumber+" Address : "+address.toString();
	}
}

class Address {
	private int suitNo;
	private String streetName;
	private String city;
	private int pinCode;

	public int getSuitNo() {
		return suitNo;
	}

	public void setSuitNo(int suitNo) {
		this.suitNo = suitNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String name) {
		this.streetName = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
public boolean equals(Object obj){
		if(obj instanceof Address){
			Address addObj =(Address)obj;
			if(this.suitNo==addObj.getSuitNo() && 
					this.streetName.equals(addObj.getStreetName())&&
					this.city.equals(addObj.getCity()) &&
					this.pinCode == addObj.getPinCode()) 
			{
				return true;
			}
		}
		return false;
	}


public  String toString(){ 
	return "suit_No : "+suitNo+" Street : "+streetName+" City : "+city+" PinCode : "+pinCode;
}

}
