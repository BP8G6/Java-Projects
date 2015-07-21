package com.bellinfo.batch2.day4;

public class Connstructors {

	
	public static void main(String[] args) {

		//ExConstructor con = new ExConstructor();
		ConstructorEx2 con2 = new ConstructorEx2();

	}

}

class ExConstructor
{
	// If writing Constructor write all the constructors else dont write complier will take care
	
	//Constructor will not have return type and name same as class name
	
	ExConstructor()	{
		System.out.println("My own Default Constructor");
	}
	
	
	ExConstructor(int a){
		System.out.println("My Own single Argument Constructor");
	}
	
	ExConstructor(int a, int b)	{
		System.out.println("My Own double Argument Constructor"+ a++ + b--);
	}
}


class ConstructorEx2 extends ExConstructor
{
	ConstructorEx2(){ 
		//Here it will Call the super method before exectuing down stmt
		System.out.println("inside ConstructorEx2");
	}
}