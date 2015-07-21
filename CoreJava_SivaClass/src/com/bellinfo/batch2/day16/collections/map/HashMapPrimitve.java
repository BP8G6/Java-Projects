package com.bellinfo.batch2.day16.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrimitve {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1, 123);
		hm.put(2, 234);
		hm.put(3, 345);
		hm.put(4, 456);
		hm.put(5, 567);
		
		for(Map.Entry<Integer, Integer> entry: hm.entrySet())
		{
			int key = entry.getKey();
			int Value = entry.getValue();
			System.out.println("Key : "+key+"\tValue : "+Value);
		}
		
		System.out.println("Key And Value for INteger and Float");
		
		HashMap<Integer,Float> HM = new HashMap<>();
		HM.put(1, 123.123f);
		HM.put(2, 234.234f);
		HM.put(3, 345.345f);
		HM.put(4, 456.456f);
		HM.put(5, 567.567f);
		
		for(Map.Entry<Integer, Float> entry: HM.entrySet())
		{
			int key = entry.getKey();
			float Value = entry.getValue();
			System.out.println("Key : "+key+"\tValue : "+Value);
		}

	}

}
