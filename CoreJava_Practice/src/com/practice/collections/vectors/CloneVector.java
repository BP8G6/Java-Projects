package com.practice.collections.vectors;

import java.util.Vector;

public class CloneVector {

	public static void main(String[] args) {
		Vector<String> vctr = new Vector<String>();
		vctr.add("One");
		vctr.addElement("Two");
		vctr.add(2, "Three");
System.out.println("Elements in the Vector : "+vctr);
Vector<String> copy = (Vector<String>) vctr.clone();
System.out.println("Copy of Vector : "+copy);
	}

}
