package com.bellinfo.batch2.day9.inheritance;

public class GrandParent {
	
	/*GrandParent()
	{
		System.out.println("Grand Parent default Constructor...........!");
	}*/
	
	GrandParent(int a)
	{
		System.out.println("Grand Parent Single Argument Constructor..!");
	}
	
	private final int field_size =5;
	public void fields()
	{
		System.out.println(" Acres = "+field_size);
	}

	private void property()
	{
		System.out.println("5 Acres Land");
	}
}
