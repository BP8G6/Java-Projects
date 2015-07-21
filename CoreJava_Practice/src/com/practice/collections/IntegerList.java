package com.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IntegerList {

	public static void main(String[] args) {
		
		int rem =5;
		List<Integer> IntLst = new ArrayList<Integer>();
		IntLst.add(1);
		IntLst.add(2);
		IntLst.add(3);
		IntLst.add(4);
		IntLst.add(5);
		ListIterator<Integer> itr = IntLst.listIterator();
		System.out.println("Elements in Forward Direction........!");
while(itr.hasNext())
{
	System.out.print(itr.next()+"\t");
}

System.out.println("\nElements in Backward Direction..........! ");
while(itr.hasPrevious())
{
	System.out.print(itr.previous()+"\t");
}
	}

}
