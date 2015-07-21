package com.bellinfo.batch2.day9.inheritance;

public class Child extends Parent {

	Child(int a) {
		super(10);
		
	}

	public void job()
	{
		System.out.println("Child Having a Job");
	}
	
	public void job(int salary)
	{
		
		System.out.println("Salary : "+salary);
	}
	
	}

