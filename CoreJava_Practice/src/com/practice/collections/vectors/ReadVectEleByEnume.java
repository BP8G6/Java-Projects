package com.practice.collections.vectors;

import java.util.Enumeration;
import java.util.Vector;

public class ReadVectEleByEnume {

	public static void main(String[] args) {
		Vector<String> vectr = new Vector<String>();
		
		vectr.add("One");
		vectr.add(1, "TWO");
		vectr.addElement("Three");
		vectr.add("Four");
		vectr.add(4, "Five");
		System.out.println(vectr);
		System.out.println("Elements in Vector Throgh Enumeration.....!");
		Enumeration<String> em = vectr.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}

	}

}
