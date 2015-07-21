package com.bellinfo.batch2.day16.collections.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		
		//try with resource -- by using these no need to close the connections
				try (FileOutputStream fios = new FileOutputStream("F:\\BellInfo_Practice\\CoreJava_SivaClass\\src\\WritingToFile.ser");
						ObjectOutputStream oos = new ObjectOutputStream(fios);){
		
		/*try {
			FileOutputStream fios = new FileOutputStream("F:\\BellInfo_Practice\\CoreJava_SivaClass\\src\\WritingToFile.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fios);*/
			
			Courses cs = new Courses();
			cs.setCName("Advanced Java");
			cs.setInstruct("Ponnam");
			cs.setStrength(500);
			
			oos.writeObject(cs);
			//oos.close();
			//fios.close();
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}

	}

}
