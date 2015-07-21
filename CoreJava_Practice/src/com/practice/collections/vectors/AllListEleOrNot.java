package com.practice.collections.vectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AllListEleOrNot {

	public static void main(String[] args) {
		Vector<String> vectr = new Vector<String>();
		vectr.add("One");
		vectr.add("Two");
		vectr.add("Three");
		System.out.println("Elements in Vector are : "+vectr);
		List<String> lst = new ArrayList<String>();
		lst.add("Balakrisha");
		lst.add("Ponnam");
		lst.addAll(vectr);
		System.out.println("Elements in List are :"+lst);
		System.out.println("Does Vector Contain All Elements : "+vectr.containsAll(lst));
		vectr.add("Balakrisha");
		vectr.add("Ponnam");
		System.out.println("Does Vector Contain All Elements : "+vectr.containsAll(lst));

	}

}
