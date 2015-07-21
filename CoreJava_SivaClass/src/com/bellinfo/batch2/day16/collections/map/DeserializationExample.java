package com.bellinfo.batch2.day16.collections.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) {
		
		//try with resource -- by using these no need to close the connections
		try (FileInputStream fis = new FileInputStream("F:\\BellInfo_Practice\\CoreJava_SivaClass\\src\\WritingToFile.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			
		
		
		//try {
			//FileInputStream fis = new FileInputStream("F:\\BellInfo_Practice\\CoreJava_SivaClass\\src\\WritingToFile.ser");
			//ObjectInputStream ois = new ObjectInputStream(fis);
			Courses course =(Courses)ois.readObject();
			System.out.println(course);
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}

}
