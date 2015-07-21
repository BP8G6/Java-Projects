package com.bellinfo.batch2.day4;

public class HerarchialInheritance {

	public static void main(String[] args) {
		
		B b= new B();
		b.methodA();
		b.methodB();
		C c = new C();
		c.methodA();
		c.methodC();

	}

}

class A
{
	public void methodA()
	{
		System.out.println("A");
	}
}

class B extends A
{
	public void methodB()
	{
		System.out.println("B");
	}
}

class C extends A
{
	public void methodC()
	{
		System.out.println("C");
	}
}


//Multiple Inheritance  java does not support

/*
class D extends A,B
{
	
}*/