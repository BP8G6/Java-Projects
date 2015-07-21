package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
	
		HashSet<String> hs = new HashSet<String>();
		hs.add("Red");
		hs.add("Blue");
		hs.add("Green");
		hs.add("Yellow");
		hs.add("Orange");
		hs.add("Red");
		hs.add("Yellow");
		
		//System.out.println(hs);
		System.out.println("Elements in Hash Set Using Advanced For Loop");
		for(String str : hs)
		{
			System.out.print(str+"\t");
		}
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Red");
		ts.add("Blue");
		ts.add("Green");
		ts.add("Yellow");
		ts.add("Orange");
		ts.add("Red");
		ts.add("Yellow");
		
		System.out.println("\nElements in Tree Set Using Advanced For Loop");
		for(String str : ts)
		{
			System.out.print(str+"\t");
		}

	}

}
