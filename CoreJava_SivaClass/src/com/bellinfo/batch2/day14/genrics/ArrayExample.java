package com.bellinfo.batch2.day14.genrics;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] Array = new int[10];
		for(int i=0;i<Array.length;i++)
		{
			Array[i]=2*i;
		}
		
		
		for(int i=0;i<Array.length;i++)
		{
			System.out.print(Array[i]+"\t");
		}		
		
		Student[] array = new Student[4];
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		
		
		std1.setName("Balakrishna");
		std2.setName("Ponnam");
		std3.setName("Ponnam Balakrishna");
		std4.setName("Balu");
		std1.setRno(123);
		std2.setRno(234);
		std3.setRno(456);
		std4.setRno(789);
		
		
		array[0]=std1;
		array[1]=std2;
		array[2]=std3;
		array[3]=std4;
		System.out.println("\n");
	for(int i=0;i<array.length;i++)
	{
		
		System.out.println(array[i].tostring());
	}
		
		

	}

}
class Student
{
	String Name;
	int Rno;
		
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRno() {
		return Rno;
	}

	public void setRno(int rno) {
		Rno = rno;
	}
	
	public String tostring()
	{
		return "Name : "+this.Name +"\tRoll Number : "+this.Rno;
	}
	
	
	

	
}

