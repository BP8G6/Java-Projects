package com.bellinfo.batch2.day5;

public class InterfaceExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.methodRun();
		d.methodSleep();
		
		Animal a = new Dog();
		System.out.println("***************With Reference Variable*************");
		a.methodRun();
		a.methodSleep();

	}

}

interface Animal
{
	void methodSleep();
	void methodRun();
}


class Dog implements Animal
{	
	public void methodSleep() {
		System.out.println("Dog is Sleeping");
		
	}
	public void methodRun() {		
		System.out.println("Dog is Running");
	}
	
}

class cat
{
	public void methodSleep() {
		System.out.println("Cat is Sleeping");
		
	}
	public void methodRun() {		
		System.out.println("Cat is Running");
	}
}