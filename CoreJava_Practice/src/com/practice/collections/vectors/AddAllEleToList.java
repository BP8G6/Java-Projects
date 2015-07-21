package com.practice.collections.vectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AddAllEleToList {

	public static void main(String[] args) {
	
		Vector<String> vectr = new Vector<String>();
		vectr.add("One");
		vectr.add("Two");
		vectr.addElement("Three");
		vectr.add(3, "Four");
		vectr.add("Five");
		System.out.println("Elements In Vector Before Adding From List : "+vectr);
		List<String> lst = new ArrayList<String>();
		lst.add("Balakrishna");
		lst.add("Ponnam");
		vectr.addAll(lst);
		System.out.println("Elements In Vector After Adding From List : "+vectr);
	}

}
