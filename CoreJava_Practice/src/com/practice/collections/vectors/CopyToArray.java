package com.practice.collections.vectors;
import java.util.*;

public class CopyToArray {

	public static void main(String[] args) {
		
		Vector<String> vectr = new Vector<String>();
		vectr.add("One");
		vectr.add("Two");
		vectr.add("Three");
		String[] CpyArry = new String[vectr.size()];
		vectr.copyInto(CpyArry);
		System.out.println("Copied Array content:");
        for(String str:CpyArry){
            System.out.println(str);
        }
	}

}
