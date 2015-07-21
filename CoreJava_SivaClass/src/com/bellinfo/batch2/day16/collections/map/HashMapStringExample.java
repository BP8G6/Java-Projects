package com.bellinfo.batch2.day16.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapStringExample {

	public static void main(String[] args) {
	
		HashMap<String,String> hm = new HashMap<>();
		hm.put("A","Apple");
		hm.put("B", "Banana");
		hm.put("c", "Cat");
		hm.put("D", "Dog");
		hm.put("E", "Egg");
		hm.put("F", "Fruit");
		hm.put("A", "Aeroplane");
		//hm.get("D");
		
		System.out.println(hm.get("D"));
					
		//Based of Entries Retival with Advanced For Loop
		System.out.println("Based of Entries Retival with Advanced For Loop...........!");
		for(Map.Entry<String, String> entry: hm.entrySet())
		{
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : "+key+"\tValue : "+value);
		}
		
		//Based on Iterator
		System.out.println("Based on Iterator................!");
		Set<String> set=hm.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			String Value =hm.get(key);
			System.out.println("Key : "+key+"\tValue :"+Value);
		}
		
	}

}
