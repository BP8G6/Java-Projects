package com.practice.collections.vectors;

import java.util.Iterator;
import java.util.Vector;

public class ReadVectElebyIter {

	public static void main(String[] args) {		
		Vector<String> vectr = new Vector<String>();
		vectr.add("One");
		vectr.add("Two");
		vectr.add("Three");
		vectr.add("Four");
		vectr.add("Five");		
		vectr.addElement("Six");
		vectr.add(6, "Seven");
		vectr.addElement("Eight");
		vectr.add(8,"Nine");
		
		System.out.println("Elements in the Vector are : "+vectr);
System.out.println("Displaying Elements By Iterator : ");
Iterator<String> itr = vectr.iterator();
while(itr.hasNext())
{
	System.out.print(itr.next()+"\t");
}
	
	}

}
