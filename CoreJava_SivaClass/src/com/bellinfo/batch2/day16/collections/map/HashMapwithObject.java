package com.bellinfo.batch2.day16.collections.map;

import java.util.HashMap;
import java.util.Iterator;



public class HashMapwithObject {

	public static void main(String[] args) {
		
		HashMap<String,Course> hm = new HashMap();
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();		 
		Course c4 = new Course();
		Course c5 = new Course();
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
		c5.setInstruct("Ponnam");
		c5.setStrength(25);
		
		hm.put(c1.getCName(), c1);
		hm.put(c2.getCName(), c2);
		hm.put(c3.getCName(), c3);
		hm.put(c4.getCName(), c4);
		hm.put(c5.getCName(), c5);
		
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			Course CName =hm.get(key);
			System.out.println(CName); //Cname.toString()
		}
		 
		 

	}

}

class Course
{
	String Instruct;
	int strength;
	String CName;
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
	
	public boolean Object(Object obj)
	{
		if(obj instanceof Course)
		{
			Course cs =(Course)obj;
			if(this.getCName().equals(cs.getCName())){
				return true;
			}
		}
		return false;
	}
	
	public String toString()
	{
		return "Course Name :"+getCName()+"\tInstructor :"+getInstruct()+"\tStrength : "+getStrength();
	}
}
