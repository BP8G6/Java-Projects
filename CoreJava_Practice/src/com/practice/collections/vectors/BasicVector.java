package com.practice.collections.vectors;

import java.util.Vector;

public class BasicVector {

	public static void main(String[] args) {
	
		Vector<String> vect = new Vector<String>();
		vect.add("Java");
		vect.add("Oracle");
		vect.add("SQL");
		vect.add("Perl");
		vect.add("C++");
		vect.add(".NET");
		
		//Adding Element At Index 2
		vect.add(2, "Adding At Second Index");
		
		//Gettinng Element by Index Position
		vect.getClass();
		System.out.println("Elements in the Vector are : "+vect);
		System.out.println("At the Index Number 2 : "+vect.get(2));
		System.out.println("At the Index Number 3 : "+vect.get(3));
		System.out.println("At the Index Number 5 : "+vect.get(5));
		System.out.println("First Element of the Vector is : "+vect.firstElement());
		System.out.println("Last Element of the Vector is : "+vect.lastElement());
		System.out.println("Is the List Empty ? "+vect.isEmpty());
		System.out.println("Capacity Of the Vector is : "+vect.capacity());
		
		//System.out.println(vect);
		

	}

}
