package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StringObjArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Yellow");
		al.add("Green");
		al.add("Orange");
		al.add("Red");
		//al.add(1);  Array List is Of String type
		System.out.println("Element at Index 0 is : "+al.get(0));
		System.out.println("Elements in array List are :  " + al);
		al.remove("Red");
		System.out.println("Elements in array List after removing : "+al);
		System.out.println("Does element Yellow Contains in array List ? :"+al.contains("Yellow"));
		System.out.println("Size of Array List is : "+al.size());
		System.out.println("Is the Array List Empty ? :"+al.isEmpty());
		System.out.println("Index of Green is : "+al.indexOf("Green"));
		System.out.println("Last Index OF Orange is : "+al.lastIndexOf("Orange"));
		//al.clear();
		//System.out.println(al);
		
		ArrayList<String> alExtra = new ArrayList<String>();
		/*alExtra.add("Purple");
		alExtra.add("Pink");
		alExtra.add("SkyBlue");*/
		alExtra.addAll(al);
		
		System.out.println("\n Checking Two Array Lists Are Equal or Not...!");
		//al.addAll(alExtra);
		if(alExtra.equals(al))
		{
			System.out.println("Both are Equal......!");
		}
		else
		{
			System.out.println("Both are Not Equal.....!");
		}
		//al.clear();
		
		System.out.println("Elements in Extra Array List"+alExtra);
		
		System.out.println("\nElements in Array List Usingd For Loop :");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Elements in Array List By For Loop : "+al.get(i));
		}
		
		System.out.println("\nElements in Array List Using Iterator :");
		
		Iterator<String> itr = al.iterator();
		//al.isEmpty();
		while(itr.hasNext())
		{
			System.out.println("Elements in Array List By Iterator : "+itr.next());
		}
		
		System.out.println("\nElements in Array List Using Advanced For Loop :");
		for(String str : al)
		{
			System.out.println(str);
		}
		
		
	}

}
