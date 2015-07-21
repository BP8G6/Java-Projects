package com.bankexample;

public class Person {
	private String FirstName;
	private String LastName;
	private String AcctNo;
	private String AcctType;
	private int deposit;
	
	
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAcctNo() {
		return AcctNo;
	}
	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	public String getAcctType() {
		return AcctType;
	}
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}
	
	public static void main(String args[])
	{
	CheckingAccout ch= new CheckingAccout();
	
	ch.validateDeposit(123);
	}

}
