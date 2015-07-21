package core.java.assignment4;

import java.util.Scanner;



public class DuplicateElmination {
	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		Student[] student = new Student[5];
	
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		
		
		Address addr1 = new Address();
		Address addr2 = new Address();
		Address addr3 = new Address();
		Address addr4 = new Address();
		Address addr5 = new Address();
		
		
		
		System.out.println("Enter The Student Details...!");
		std1.getData();
		addr1.getAddressData();
		std2.getData();
		addr2.getAddressData();
		std3.getData();
		addr3.getAddressData();
		System.out.println("Do You Want to Continue to Add More Students...(Y/N)");
		char ch =sc.next().charAt(0);	
		char ch1='n';
		if(ch=='y')
		{
			std4.getData();
			addr4.getAddressData();
			System.out.println("Do You Want to Continue to Add More Students...(Y/N)");
			ch1 =sc.next().charAt(0);
			
			if(ch1 =='y')
			{
				std5.getData();
				addr5.getAddressData();
				System.out.println("Your Limit is Over You Cant Add more Students");
			}
			
			
		}		
		
		std1.setAddress(addr1);
		std2.setAddress(addr2);
		std3.setAddress(addr3);
		std4.setAddress(addr4);
		std5.setAddress(addr5);
		
		student[0]=std1;
		student[1]=std2;
		student[2]=std3;
		student[3]=std4;
		student[4]=std5;	
		std1.setAddress(addr1);
		Student STUDENT = null;
		
		System.out.println("Students Details......!");
		for(int i=0;i<student.length;i++)
		{
		   if(i!=3 && i!=4)	
		   {
				STUDENT=student[i];
				System.out.println(STUDENT);
		   }
		   else
		   {
			   if(ch=='y')
			   {
				   STUDENT=student[3];
					System.out.println(STUDENT);
			   }
			   if(ch1=='y')
			   {
				   STUDENT=student[4];
					System.out.println(STUDENT);
			   }
		   }
		}
		
		for(int i=0;i<student.length;i++)
		{
			if(i!=3 && i!=4)	
			   {
				if(student[i].equals(student[i+1]))
				{
					student[i]=null;
				}
			   }
			   else
			   {
				   if(ch=='y')
				   {
					   if(student[i].equals(student[i+1]))
						{
							student[i]=null;
						}
				   }
				   if(ch1=='y')
				   {
					   if(student[i].equals(student[i+1]))
						{
							student[i]=null;
						}
				   }
			   }
		}
			
			//display after removing Duplicates
		System.out.println("Students After Removing Duplicates......!");
			
			for(int i=0;i<student.length;i++)
			{
			   if(i!=3 && i!=4)	
			   {
					STUDENT=student[i];
					if(student[i]!=null)
					{
					System.out.println(STUDENT);
					}
			   }
			   else
			   {
				   if(ch=='y')
				   {
					   STUDENT=student[3];
					   if(student[i]!=null)
						{
						System.out.println(STUDENT);
						}
				   }
				   if(ch1=='y')
				   {
					   STUDENT=student[4];
					   if(student[i]!=null)
						{
						System.out.println(STUDENT);
						}
				   }
			   }
			}
			
		}
			
		}
		
			

class Student 
{
	String Name;
	int RollNumber;
	Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public  void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of Student");
		Name = sc.nextLine();
		System.out.println("Enter the Roll Number of Student");
		RollNumber = sc.nextInt();
		
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Student)
		{
			Student studObj =(Student)obj;
			if(this.RollNumber==studObj.RollNumber && 
					this.Name.equals(studObj.Name) && //equals from string class
					this.address.equals(studObj.getAddress())) // equals from Address class
				return true;
		}
			
		return false;
			}
	
	public String toString()
	{
		return "Name : "+Name+" RollNumber : "+RollNumber+" Address : "+address;//.toString();
	}
}

class Address
{
	String StreetName;
	String City;
	String State;
	int Pin;
	
	public  void getAddressData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of Street");
		StreetName = sc.nextLine();
		System.out.println("Enter the Name of City");
		City = sc.nextLine();
		System.out.println("Enter the Name of State");
		State =sc.nextLine();
		System.out.println("Enter the PinCode");
		Pin = sc.nextInt();
		
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Address){
			Address addObj =(Address)obj;
			if(		this.StreetName.equals(addObj.StreetName)&&
					this.City.equals(addObj.City) &&
					this.Pin == addObj.Pin) 
			{
				return true;
			}
		}
		return false;
	}
	
	public  String toString(){ 
		return "Street : "+StreetName+" City : "+City+"State : "+State+" PinCode : "+Pin;
	}
}
