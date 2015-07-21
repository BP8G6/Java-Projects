package com.practice.collections.arraylists;

import java.util.ArrayList;

public class BasicArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		System.out.println("Elements in the Array List are : "+al);
		System.out.println("Elements a the Array Index 0 is : "+al.get(0));
		System.out.println("Elements a the Array Index 1 is : "+al.get(1));
		System.out.println("Does Array Contains Element Three ? "+al.contains("Three"));
		System.out.println("Is Array List Empty ? :"+al.isEmpty());
		al.add(1, "Balakrishna");
		System.out.println("Adding element Balakrishna at index 1 : "+al);
		System.out.println("Index of Five is "+al.indexOf("Five"));
        System.out.println("Size of the arraylist is: "+al.size());

	}

}
