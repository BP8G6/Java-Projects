package com.bellinfo.batch2.day16.collections.map;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapObjectString {

	public static void main(String[] args) {
		HashMap<Courses,Integer> hm = new HashMap<>();
		
		Courses c1 = new Courses();
		Courses c2 = new Courses();
		Courses c3 = new Courses();		 
		Courses c4 = new Courses();
		Courses c5 = new Courses();
		
		c1.setCName("Java");
		c1.setInstruct("Siva");
		c1.setStrength(50);
		
		c2.setCName("SQL");
		c2.setInstruct("Raj");
		c2.setStrength(25);
		
		c3.setCName("J2EE");
		c3.setInstruct("Vamsi");
		c3.setStrength(50);
		
		c4.setCName("UI");
		c4.setInstruct("BALU");
		c4.setStrength(30);
		
		c5.setCName("UI");
		c5.setInstruct("BALUgg");
		c5.setStrength(35);
		
		hm.put(c1,c1.getStrength());
		hm.put(c2,c2.getStrength());
		hm.put(c3,c3.getStrength());
		hm.put(c4,c4.getStrength());
		hm.put(c5,c5.getStrength());
		
		Iterator<Courses> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			Courses key = itr.next();
			Integer CName =hm.get(key);
			System.out.println(key); //Cname.toString()
		}
		 

	}

}

class Courses implements Serializable
{
	String Instruct;
	transient int strength;
	transient String CName;
	public String getInstruct() {
		return Instruct;
	}
	public void setInstruct(String instruct) {
		Instruct = instruct;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Courses)
		{
			Courses cs =(Courses)obj;
			//if(this.getCName().equals(cs.getCName())){
				if(this.getStrength()==cs.getStrength()){
				return true;
			}
		}
		return false;
	}
	
	public String toString()
	{
		return "Courses Name :"+getCName()+"\tInstructor :"+getInstruct()+"\tStrength : "+getStrength();
	}
	
	
	//This method checks for the equals and checks which object need to check for duplictaes
	public int hashCode()
	{
		int x=21;
		//return x*21+getCName().hashCode(); // Based on Course Name
		//return x*21+getInstruct().hashCode(); // Based on Instructor Name
		return x*21+getStrength();   // Based on Strength
	}
}
