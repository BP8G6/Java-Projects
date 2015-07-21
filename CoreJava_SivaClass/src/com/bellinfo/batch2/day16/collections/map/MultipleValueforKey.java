package com.bellinfo.batch2.day16.collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MultipleValueforKey {

	public static void main(String[] args) {

		/*Set<String> s = new HashSet<String>();
		s.add("Apple");
		s.add("Aeroplane");*/

		ArrayList<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Aeroplane");
		

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Banana");
		al1.add("Bike");

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Cat");
		al2.add("Cartoon");

		HashMap<String, Collection> hm = new HashMap<>();
		
		//hm.put("A", s);
		hm.put("A", al);
		hm.put("B", al1);
		hm.put("C", al2);
		//hm.put("C", al2); // these will not print because it elminates dublicates

		

		// Based of Entries Retival with Advanced For Loop
		System.out
				.println("Based of Entries Retival with Advanced For Loop...........!");
		for (Map.Entry<String, Collection> entry : hm.entrySet()) {
			String key = entry.getKey();
			Collection value = entry.getValue();
			System.out.println("Key : " + key + "\tValue : " + value);
		}
		
		
		System.out.println("Using Iterator....................!");
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			Collection value =hm.get(key);
			System.out.println("Key : "+key+"\tValue : "+value);
		}

	}

}
