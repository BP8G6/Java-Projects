package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
	
		ArrayList<Asian> al = new ArrayList<>();
		Asian a1 = new Asian();
		a1.setName("India");
		a1.setDebt(1000);
		
		Asian a2 = new Asian();		
		a2.setName("China");
		a2.setDebt(1500);
		
		Asian a3 = new Asian();		
		a3.setName("Japan");
		a3.setDebt(1500);
		
		Asian a4 = new Asian();		
		a4.setName("India");
		a4.setDebt(1300);
		
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		
		//Collections.sort(al, new NameBasedComparision());  // Comparision first for name based
		Collections.sort(al, new DebtComparision());         // Comparision first for Det based 
		
		for(Asian a :al)
		{
			System.out.println(a);
		}
		

	}

}

class NameBasedComparision implements Comparator
{	
	public int compare(Object o1, Object o2) {
		Asian as1 =(Asian)o1;
		Asian as2 =(Asian)o2;
		
		int x=as1.getName().compareTo(as2.getName());
		if(x==0)
		{
			x=as1.getDebt()-as2.getDebt();
		}
		return x;
	}
	
}

class DebtComparision implements Comparator
{


	public int compare(Object o1, Object o2) {
		Asian as1 =(Asian)o1;
		Asian as2 =(Asian)o2;
		
		int x=as1.getDebt()-as2.getDebt();
		if(x==0)
		{
			x=as1.getName().compareTo(as2.getName());
		}
		return x;
	}
	
}


class Asian
{
	private String name;
	private int debt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDebt() {
		return debt;
	}
	public void setDebt(int debt) {
		this.debt = debt;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Asian){
			Asian as =(Asian)o;
			if(this.getName().equals(as.getName()) && this.getDebt()==as.getDebt())
			{
				return true;
			}
			
		}
		return false;
	}
	
	public String toString()
	{
		return "Name : "+getName()+"\tDebt : "+getDebt();
	}
}