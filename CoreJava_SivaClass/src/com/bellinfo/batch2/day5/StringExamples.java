package com.bellinfo.batch2.day5;

public class StringExamples {

	public static void main(String[] args) {
		
		String str1 = new String("PONNAM");
		String str2 = new String("KRISHNA");
		String str3 ="PONNAM";
		String str4 = "PONNAM";		
		String str5 = new String(str3);
		
		if(str1.equals(str4))
		{
			System.out.println("Values are Equal");
		}
		else System.out.println("Values are Different");
		
		if(str1==str4)
		{
			System.out.println("Address are Equal");
		}
		else
			System.out.println("Address are Different");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
	
	}

}