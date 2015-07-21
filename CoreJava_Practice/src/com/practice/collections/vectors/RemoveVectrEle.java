package com.practice.collections.vectors;

import java.util.Vector;

public class RemoveVectrEle {

	public static void main(String[] args) {
		Vector<String> vectr = new Vector<String>();
		vectr.add("One");
		vectr.addElement("Two");
		vectr.add(2,"Three");
		System.out.println("Elements in Vector Are : "+vectr);
		vectr.clear();
		System.out.println("Vector After removing Elements : "+vectr);

	}

}
