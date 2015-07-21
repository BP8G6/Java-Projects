package com.bellinfo.batch2.day12;

import java.lang.reflect.Method;

public class GarbageCollection {
	int x=25;
	String xyz=new String("BALAKRISHNA PONNAM");
	public static void main(String[] args) {
		GarbageCollection gce = new GarbageCollection();
		gce.xyz.concat("Ponnam Balakrishna B.Tech(cs),M.s(cs)");
		gce.method1();
		gce.method2();
		gce=null;
		System.gc(); // This Call the Finalize method
		Runtime.getRuntime().gc();//other way calling gc
		gce.method1(); // This gives error because assigning NULL to gce so that link is broken
	}
	
	public void method1()
	{
		System.out.println("I am in Method1");
	}
	
	public void method2()
	{
		System.out.println("I am in method2");
	}
	
	public void finalize()
	{
		System.out.println("In Finalize Method........Finalize..!");
	}

}
