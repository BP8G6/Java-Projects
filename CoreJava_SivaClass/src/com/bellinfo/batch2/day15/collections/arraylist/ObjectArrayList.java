package com.bellinfo.batch2.day15.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




public class ObjectArrayList {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter Number of Objects you need :");
		 int nobj = sc.nextInt();
		ArrayList<Device> al = new ArrayList(nobj);
		
		for(int i=0;i<nobj;i++)
		{
			Device d = new Device();

			System.out.println("Enter The IMEI Number");
			d.setIMEI(sc.next());
			System.out.println("Enter The Manufacturer Name");
			d.setManufact(sc.next());
			System.out.println("Enter The Memory");
			d.setMemory(sc.nextInt());
			System.out.println("Enter The Model");
			d.setModel(sc.next());
			System.out.println("Enter The Price of Device");
			d.setPrice(sc.nextDouble());
			System.out.println("Enter The Processor");
			d.setProcessor(sc.next());
			System.out.println("Enter The Version Number");
			d.setVersion(sc.nextInt());
			al.add(d);
			
			
		}
		
		//System.out.println(al);
		
		//getData();
		/*
		Device d1 = new Device();
		d1.setIMEI("12345ABC");
		d1.setManufact("BellInfo");
		d1.setMemory(500);
		d1.setModel("I5");
		d1.setPrice(4000.00);
		d1.setProcessor("Intel");
		d1.setVersion(1);
		
		Device d2 = new Device();
		d2.setIMEI("12345ABC");
		d2.setManufact("BellInfo");
		d2.setMemory(500);
		d2.setModel("I5");
		d2.setPrice(4000.00);
		d2.setProcessor("Intel");
		d2.setVersion(1);
		
		Device d3 = new Device();
		d3.setIMEI("12345DEF");
		d3.setManufact("BellInfoSolutions");
		d3.setMemory(50000);
		d3.setModel("I565");
		d3.setPrice(400000.00);
		d3.setProcessor("Intel Pentium");
		d3.setVersion(2);
		
		if(!al.contains(d1)){
			al.add(d1);	
		}
		if(!al.contains(d2)){
			al.add(d2);	
		}
		if(!al.contains(d3)){
			al.add(d3);	
		}
*/
		

Iterator itr = al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
		
	}
	
	

}

class Device
{
	String Model;
	String IMEI;
	int Version;
	String Manufact;
	double price;
	int memory;
	String processor;
	
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	public int getVersion() {
		return Version;
	}
	public void setVersion(int version) {
		Version = version;
	}
	public String getManufact() {
		return Manufact;
	}
	public void setManufact(String manufact) {
		Manufact = manufact;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public String toString()
	{
		return "Model :"+Model +" IMEI :"+IMEI+ " Version :"+Version +" Manufacture :"+Manufact+" Price :"+price +" Memory : "+memory+" Processor :"+processor;
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Device)
		{
			Device d = (Device) obj;
		if(this.getMemory()==d.getMemory() && this.getPrice()==d.getPrice() 
				&& this.getIMEI().equals(d.getIMEI()) && this.getManufact().equals(d.getManufact())
				&& this.getModel().equals(d.getModel()) && this.getProcessor().equals(d.getProcessor()) 
				&& this.getVersion()==d.getVersion()){		
			
				return true;
		}
	}
		return false;
	
}
	
}
