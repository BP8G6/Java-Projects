package com.practice.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArryListContainAllListEle {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		System.out.println("List of Elements in Array List : "+al);
		System.out.println("Element at Index 1 : "+al.get(1));
		List<String> lst = new ArrayList<String>();
		lst.add("Five");
		lst.add("Six");
		System.out.println("Elements in the List : "+lst);
		System.out.println("Does Array List Contain all Elements in List ? "+al.containsAll(lst));

	}

}
