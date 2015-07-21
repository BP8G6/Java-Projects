package com.practice.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

public class AddListToArry {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		System.out.println("List of Elements in ArrayList : "+al);
		List<String> lst = new ArrayList<String>();
		lst.add("Balakrishna");
		lst.add("Ponnam");
		System.out.println("List of Elemenets in List : "+lst);
		lst.addAll(al);
		System.out.println("List of Elements in ArrayList After Adding List : "+lst);
		
		
	}

}
