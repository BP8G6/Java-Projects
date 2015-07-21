package com.practice.collections.arraylists;

import java.util.ArrayList;

public class DelAllFrmArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		System.out.println("List Of Elements in ArrayList Before Deleting : "+al);
		al.clear();
		System.out.println("List of Elements in Array List After Deleting : "+al);

	}

}
