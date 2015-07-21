package com.practice.collections.arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadEleUsingIterator {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add(3,"Four");
		Iterator<String> ir = al.iterator();
		System.out.println("Elements in Array List Using Iterator");
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

	}

}
