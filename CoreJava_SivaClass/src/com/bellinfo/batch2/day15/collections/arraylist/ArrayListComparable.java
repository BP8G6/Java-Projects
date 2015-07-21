package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.Scanner;
import java.util.TreeSet;

public class ArrayListComparable {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		TreeSet<Bike> ts = new TreeSet<>();
		Bike b = new Bike();
		Engine e1 = new Engine();

		b.setColor("White");
		b.setName("Unicorn");
		b.setGears(4);
		b.setPrice(54000.00);
		b.setTankcap(20);
		//b.setEngine(e1);

		Bike b1 = new Bike();

		b1.setColor("White");
		b1.setName("Honda");
		b1.setGears(2);
		b1.setPrice(54000.00);
		b1.setTankcap(20);

		Bike b2 = new Bike();

		b2.setColor("White");
		b2.setName("Honda");
		b2.setGears(1);
		b2.setPrice(54000.00);
		b2.setTankcap(20);

		ts.add(b);
		ts.add(b1);
		ts.add(b2);

		for (Bike bi : ts) {
			System.out.println(bi);
		}

	}

}

class Bike implements Comparable<Bike> {
	int gears;
	String color;
	String Name;
	int tankcap;
	Double price;
	Bike Engine;
	

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getTankcap() {
		return tankcap;
	}

	public void setTankcap(int tankcap) {
		this.tankcap = tankcap;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public Bike getEngine() {
		return Engine;
	}

	public void setEngine(Bike Engine) {
		this.Engine = Engine;
	}

	public String toString() {
		return "Name : " + Name + "\tColor : " + color + "\tGears : " + gears
				+ "\tTankCapacity : " + tankcap;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Bike) {
			Bike b = (Bike) obj;
			if (this.getColor().equals(b.getColor())
					&& this.getGears() == b.getGears()
					&& this.getName().equals(b.getName())
					&& this.getPrice().equals(b.getPrice())
					&& this.getTankcap() == b.getTankcap()) {
				return true;

			}
		}
		return false;

	}

	public int compareTo(Bike o) {
		Bike b=null;
		if (o instanceof Bike) {
			b = (Bike) o;
		}
		
		//return this.getGears()-b.getGears();	//return this.getGears()-b.getGears(); -- reverese order
		//return this.getColor().compareTo(b.getColor()); //For Comaring Strings
		return this.getName().compareTo(b.getName());
		
	}
}

class Engine implements Comparable<Engine>
{
	int hrspw;
	String engmanufact;
	public int getHrspw() {
		return hrspw;
	}
	public void setHrspw(int hrspw) {
		this.hrspw = hrspw;
	}
	public String getEngmanufact() {
		return engmanufact;
	}
	public void setEngmanufact(String engmanufact) {
		this.engmanufact = engmanufact;
	}
	
	
	public String toString()
	{
		return "HorsePower : "+getHrspw()+"\tEngine Manufacturer"+getEngmanufact();
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Engine){
		Engine en =(Engine)obj;
		if(this.getHrspw()==en.getHrspw() && this.getEngmanufact().equals(en.getEngmanufact())){
			return true;
		}
		}
		return false;
	}
	
	public int compareTo(Engine eng) {
		Engine e=null;
		if(eng instanceof Engine){
			e =(Engine)eng;
		}
		return this.getHrspw()-e.getHrspw();
	}
}

