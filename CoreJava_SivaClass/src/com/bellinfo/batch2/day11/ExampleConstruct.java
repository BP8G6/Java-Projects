package com.bellinfo.batch2.day11;

public class ExampleConstruct {

	ExampleConstruct()
	{
		System.out.println("This is a Default Constructor");
	}
	ExampleConstruct( int a)
	{
		System.out.println("This is Argumented Constructor with value : "+a);
	}
	
	 int method1()
	{
		System.out.println("This is method1 in parent Class");
		return 1;
	}
	 
	 void Y()
	 {
		 
	 }
}


class CallingClass extends ExampleConstruct
{	
	public int method1()
	{
		System.out.println("This is method1 in Child Class");
		return 0;
	}
	
	public void x()
	{
		
	}
	public static void main(String args[])
	{
		ExampleConstruct P =new ExampleConstruct();
		P.method1();
		P.Y();
	}
}

