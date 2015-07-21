package com.bellinfo.batch2.day5;

public class StringEquals {

	public static void main(String[] args) {

		Student student = new Student(1, "PONNAM");
		Student student1 = new Student(2, "PONNAM");
		Student student2 = new Student(2, "PONNAM");
		

		if (student1 == student2) {
			System.out.println("Both Address locations are Equal");
		} else
			System.out.println("Both Address Locations Are Not Equal");

		if (student1.equals(student2)) {
			System.out.println("Both Values are Equal");
		} else
			System.out.println("Both Values are Different");
	}

}

class Student {
	int rollNumber;
	String Name;

	Student(int rollNumber, String Name) {
		//this.rollNumber = rollNumber;
		this.Name = Name;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Student){ // check student of class obect obj
			Student compStudent = (Student)obj; //downcasted the object to student
			String compName =compStudent.Name;
			if(this.rollNumber == this.rollNumber && this.Name.equals(compName)){ //equals from string class
				return true;
			}			
		}
		return false;		
	}

}
