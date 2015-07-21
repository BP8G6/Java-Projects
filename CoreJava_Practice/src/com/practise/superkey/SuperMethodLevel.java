package com.practise.superkey;

public class SuperMethodLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childclass cc = new Childclass();
		cc.display();
	}

}

class Baseclass
{
	Baseclass()
	{
		System.out.println("Base Class constructor");
	}
	
	public void display()
	{
		System.out.println("This is the Base Class Display Method");
	}
}

class Childclass extends Baseclass
{
	public void display()
	{
		System.out.println("This is the Child Class Display Method");
		super.display();
	}
}