package com.advance.spring;



public class Employee {
	
	private String firstName;
	private String lastName;
	private String title;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String toString()
	{
		return " Employee "+getFirstName()+" "+getLastName()+" "+getTitle();
	}

}
