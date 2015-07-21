package com.practise.superkey;

public class SuperVarLevel {

	public static void main(String[] args) {

		B b = new B();
		b.assign(10, 20);
		b.display();

	}

}

class A
{
	int a;
}

class B extends A
{
	int x,a;
	
	public void assign(int x,int y)
	{
		this.a=x;
		super.a=y;
	}
	
	public void sum()
	{
		x=this.a+super.a;
	}
	
	public void display()
	{
		System.out.println("Value of a in Sub Class :"+this.a);
		System.out.println("Value of a in Super Class :"+super.a);
		System.out.println("Sum of these variables :"+(this.a+super.a));
	}
}