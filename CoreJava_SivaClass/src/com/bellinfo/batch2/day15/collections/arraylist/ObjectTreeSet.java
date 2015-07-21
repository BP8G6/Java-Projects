package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ObjectTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Cars> ts = new TreeSet<Cars>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Objects");
		int nobj = sc.nextInt();
		
		for(int i=0;i<nobj;i++)
		{
			Cars c = new Cars();
			System.out.println("Enter the Car Manufacturer");
			c.setManufact(sc.next());
			System.out.println("Enter the Color of Car");
			c.setColor(sc.next());
			System.out.println("Enter the Milage of Car");
			c.setMilage(sc.nextInt());
			System.out.println("Enter the Price of Car");
			c.setPrice(sc.nextDouble());			
			ts.add(c);
			
		}
		
		Iterator itr =ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*
		Cars c1 = new Cars();
		c1.setManufact("Honda");
		c1.setColor("Black");
		c1.setMilage(100);
		c1.setPrice(85000.00);

		Cars c2 = new Cars();
		c2.setManufact("Honda");
		c2.setColor("Black");
		c2.setMilage(100);
		c2.setPrice(85000.00);
		
		Cars c3 = new Cars();
		c3.setManufact("BMW");
		c3.setColor("White");
		c3.setMilage(120);
		c3.setPrice(45.00);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		
		for(Cars cr :ts)
		{
			System.out.println(cr);
		}
*/
	}
		
	}


class Cars implements Comparable<Cars>
{
	int milage;
	String manufact;
	String color;
	double price;
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getManufact() {
		return manufact;
	}
	public void setManufact(String manufact) {
		this.manufact = manufact;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()
	{
		return "ManuFacturer : "+manufact+ "\tMilage : "+milage+"\tColor : "+color+"\tPrice : "+price;
		
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Car)
		{
			Car c = (Car) obj;
			
			if(this.getColor().equals(c.getColor()) && this.getManufact().equals(c.getManufact()) &&
				this.getMilage()==c.getMilage() && this.getPrice()==c.getPrice())
			{
				//System.out.println("Balakrishna");
				return true;
			}
		}
		return false;
		
	}
	@Override
	public int compareTo(Cars o) {
		return color.compareTo(o.color);
		//return 0;
	}
	
	
}