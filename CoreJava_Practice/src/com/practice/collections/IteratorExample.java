package com.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<String> stngLst =new ArrayList<String>();
		stngLst.add("JAVA");
		stngLst.add("SQL");
		stngLst.add("Oracle");
		stngLst.add("JAVA");//List Allows Duplictaes
		stngLst.add("C++");
		stngLst.add(".NET");
		System.out.println(stngLst);
		System.out.println("Displaying Using Iterator........!");
		Iterator<String> itr = stngLst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
