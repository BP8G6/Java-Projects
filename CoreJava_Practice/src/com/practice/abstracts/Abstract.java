package com.practice.abstracts;

public class Abstract {

	public static void main(String[] args) {
		
		Derivedclass2 d = new Derivedclass2();
		d.method1();
		d.method2();
		d.methodD1();
		d.methodD2();
		d.D2Method1();

	}

}

abstract class AbstractBaseClass
{
	public void method1(){
		System.out.println("Method1 Implemented In Abstract Base Class");
	}
	
	abstract public void method2();
}

//Class Should be Abstrcat because parent class abstract is not implementing
abstract class Derivedclass1 extends AbstractBaseClass
{
	public void methodD1()	{
		System.out.println("Derived class Method1");
	}
	
	abstract public void methodD2();
}


class Derivedclass2 extends Derivedclass1
{
	public void D2Method1()	{
		System.out.println("Method1 of Derived Class2");
	}
	
	public void method2(){	
		System.out.println("Method2 of Abstract Base Class");
	}
	
	public void methodD2(){
	System.out.println("Method2 of Abstract Derived Class");	
	}
}