package com.bellinfo.batch2.day5;

public class AbstractExample {

	public static void main(String[] args) {
		
		AbstractDog dog = new AbstractDog();
	dog.methodsleep();
	dog.noOfLegs();
	
	System.out.println("************With Reference Variable*************");
	AbstractAnimal animal = new AbstractDog();
	animal.methodsleep();
	animal.noOfLegs();

	
	AbstractAnimal animal2 = new Monkey();
	animal2.methodsleep();
	animal2.noOfLegs();
	}

}

abstract class AbstractAnimal
{
	 public void methodsleep(){
		 System.out.println("All Animal Sleep 8 hrs");
	 }
	
	 abstract void noOfLegs();
}

class AbstractDog extends AbstractAnimal
{	
	void noOfLegs() {
		System.out.println("Dog has four Legs");		
	}
	
}

class Monkey extends AbstractAnimal
{
	void noOfLegs() {
		System.out.println("Monkey Has Two Legs");		
	}
	
	public void methodsleep()
	{
		System.out.println("Monkey Sleep 12 hrs");
	}
}
