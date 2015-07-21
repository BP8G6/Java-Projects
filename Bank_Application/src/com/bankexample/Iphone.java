package com.bankexample;

public class Iphone {

	public static final int PRICE=1000;
	Person per= new Person();
	
	public boolean depositmoney()
	{
		if(per.getDeposit()>=PRICE)
		{
			return true;
		}
		return false;
	}
}
