package com.bellinfo.batch2.day14.genrics;

public class WrapperExample {

	public static void main(String[] args) {
		int a = 10, b = 20;
		// Two Ways to Convert From int To Integer Object
		// 1
		Integer integer = new Integer(a);
		// 2
		integer.valueOf(b);
		// Converting From Integer Object to int
		int x = integer.intValue();
		// Converting From Integer Object to String
		String s = integer.toString();
		// Converting int to string
		String z = s.valueOf(x);
		// Converting Integer Object to Double
		double d = integer.doubleValue();
		
		
		
		//Convering String To Integer	
		String realstring = "123";
		Integer integeReal = new Integer(realstring);
		
		String realstring1 = "Checking";
		Integer integeReal1 = new Integer(realstring1); //Will get Number Format Exception
		
		System.out.println(integeReal);
		System.out.println(integeReal1);

	}

}
