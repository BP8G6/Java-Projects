package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ObjectHashSet {

	public static void main(String[] args) {

		HashSet<Car> hs = new HashSet<Car>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Objects");
		int nobj = sc.nextInt();
		
		for(int i=0;i<nobj;i++)
		{
			Car c = new Car();
			System.out.println("Enter the Car Manufacturer");
			c.setManufact(sc.next());
			System.out.println("Enter the Color of Car");
			c.setColor(sc.next());
			System.out.println("Enter the Milage of Car");
			c.setMilage(sc.nextInt());
			System.out.println("Enter the Price of Car");
			c.setPrice(sc.nextDouble());
			
			hs.add(c);
			
		}
		
		Iterator itr =hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*Car c1 = new Car();
		c1.setManufact("Honda");
		c1.setColor("Black");
		c1.setMilage(100);
		c1.setPrice(85000.00);

		Car c2 = new Car();
		c2.setManufact("Honda");
		c2.setColor("Black");
		c2.setMilage(100);
		c2.setPrice(85000.00);
		
		Car c3 = new Car();
		c3.setManufact("BMW");
		c3.setColor("Black");
		c3.setMilage(100);
		c3.setPrice(85000.00);

		hs.add(c1);
		hs.add(c2);
		hs.add(c3);

		

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}

}

class Car {
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

	public String toString() {
		return "ManuFacturer : " + manufact + "\tMilage : " + milage + "\tColor : "
				+ color + "\tPrice : " + price;

	}

	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car c = (Car) obj;

			if (this.getColor().equals(c.getColor())
					&& this.getManufact().equals(c.getManufact())
					&& this.getMilage() == c.getMilage()
					&& this.getPrice() == c.getPrice()) {
				//System.out.println("Balakrishna");
				return true;
			}
		}
		return false;

	}
	
	public int hashCode(){
        //System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = milage*20;
        hashcode += manufact.hashCode();
        return hashcode;
    }

}