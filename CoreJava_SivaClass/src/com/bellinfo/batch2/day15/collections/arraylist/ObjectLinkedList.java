package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ObjectLinkedList {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Objects");
		int nobj = sc.nextInt();
		//ArrayList<Lappy> al= new ArrayList<Lappy>(nobj); 
		LinkedList<Lappy> ll = new LinkedList<Lappy>();
		for(int i=0;i<nobj;i++)
		{
			Lappy la = new Lappy();
			System.out.println("Enter the Lappy Manufacturer");
			la.setManufact(sc.next());
			System.out.println("Enter the Processor of Lappy");
			la.setProcessor(sc.next());
			System.out.println("Enter the Color of Lappy");
			la.setColor(sc.next());
			System.out.println("Enter the no of ports");
			la.setPortscount(sc.nextInt());
			System.out.println("Enter the Price of Lappy");
			la.setPrice(sc.nextDouble());
			if(!ll.contains(la)){
				ll.add(la);}
			
		}
		
		Iterator itr =ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*Lappy la = new Lappy();
		la.setManufact("Dell");
		la.setProcessor("Intel");
		la.setColor("Blaack");
		la.setPortscount(5);
		la.setPrice(450.00);
		
		Lappy la1 = new Lappy();
		la1.setManufact("Dell");
		la1.setProcessor("Intel");
		la1.setColor("Blaack");
		la1.setPortscount(5);
		la1.setPrice(450.00);
		
		ll.add(la);
		ll.add(la1);
		System.out.println(ll);
		
		if(!ll.contains(la)){
		ll.add(la);}
		if(!ll.contains(la1)){
		ll.add(la1);
		}
		
		System.out.println(ll);*/

	}

}


class Lappy
{
	String manufact;	
	String Processor;
	String Color;
	Double Price;
	int  portscount;
	public String getManufact() {
		return manufact;
	}
	public void setManufact(String manufact) {
		this.manufact = manufact;
	}
	public String getProcessor() {
		return Processor;
	}
	public void setProcessor(String processor) {
		Processor = processor;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public int getPortscount() {
		return portscount;
	}
	public void setPortscount(int portscount) {
		this.portscount = portscount;
	}
	
	
	public String toString()
	{
		return " Manufacturer : "+manufact+" Processor : "+Processor+" Color : "+Color+" Price"+Price+" PortsCount : "+portscount;
		
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Lappy)			
		{
			Lappy l =(Lappy) obj;
			if(this.getManufact().equals(l.getManufact()) && this.getColor().equals(l.getColor()) 
					&& this.getProcessor().equals(l.getProcessor()) && this.getPortscount()==l.getPortscount()
					&& this.getPrice().equals(l.getPrice()))
			{
				return true;
			}
			
		}
		return false;
		
	}
}
