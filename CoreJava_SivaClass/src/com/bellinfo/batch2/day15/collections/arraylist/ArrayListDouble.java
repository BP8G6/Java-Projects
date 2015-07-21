package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class ArrayListDouble {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<>();
		al.add(12.22);
		al.add(24.22);
		al.add(52.22);
		al.add(2.22);
		al.add(59.22);
		al.add(45.22);
		al.add(62.22);		
		System.out.println("Array List Before Sorting :"+al);
		TreeSet<Double> ts = new TreeSet<>();
		ts.addAll(al);
		System.out.println("Array List After Sorting Using Tree Set :"+ts);
		
		Collections.sort(al);
		System.out.println("Array List After Using Collection Method"+al);
	}

}
