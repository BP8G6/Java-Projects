package com.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveUsingIterator {

	public static void main(String[] args) {
		
		String removeElem = "Unix";
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove:");
        System.out.println(myList);
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            if(removeElem.equals(itr.next())){
                itr.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);

        System.out.println("*********************Second List**********************");
		
		String remele = "PONNAM";
		List<String> strngLst = new ArrayList<String>();
		strngLst.add("BALAKRISHNA");
		strngLst.add("PONNAM");
		strngLst.add("Krishna");
		strngLst.add("Balu");
		strngLst.add("Bala");
		Iterator<String> itr1 = strngLst.iterator();
		System.out.println("After Inserting Into List.......!");
		System.out.println(strngLst);
		System.out.println("After Removing From List.......!");
		
		while (itr1.hasNext()) {
			if (remele.equals(itr1.next())){
				itr1.remove();
			}
			
		}
		//System.out.println("After Remove");
		System.out.println(strngLst);

	}

}
