package com.practice.collections.arraylists;

import java.util.ArrayList;

public class CloneArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		System.out.println("Elements in Array List are : "+al);
		ArrayList<String> copy = (ArrayList<String>) al.clone();
		System.out.println("Copy of Array List are : "+copy);
	}

}
