package com.practice.collections.vectors;

import java.util.Vector;

public class GetSubList {

	public static void main(String[] args) {
		Vector<String> vectr = new Vector<String>();
		vectr.add("One");
		vectr.add("Two");
		vectr.add("Three");
		vectr.add("Four");
		vectr.add("Five");
		vectr.add("Six");
		System.out.println("Elements in Vectror are : "+vectr);
		System.out.println("SubList of Elements in Vectror are : "+vectr.subList(2, 4));


	}

}
