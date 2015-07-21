package com.bellinfo.batch2.day6;

public class NestedClass {

	public static void main(String[] args) {
		
		NestedClass ns = new NestedClass();
		NestedClass.Abc abc = new NestedClass.Abc();
		abc.mtd();
		
		Abc a = new Abc();
		a.mtd();
		
		NestedClass nc = new NestedClass();
		NestedClass.XY xyz = nc.new XY();
		xyz.mtd1();
	}
	
	static class Abc
	{		
		void mtd()
		{
			
		}
	}
	
	class XY
	{		
		void mtd1()
		{
			
		}
	}
	

}
