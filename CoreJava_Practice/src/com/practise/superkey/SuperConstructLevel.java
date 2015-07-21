package com.practise.superkey;

public class SuperConstructLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h =new Honda();
	}

}

class Automobiles
{
	int gears;
	int speed;
	int milage;
	Automobiles(int gears,int speed,int milage)
	{
		this.gears=gears;
		this.speed=speed;
		this.milage=milage;				
		System.out.println("Gears : "+gears+"\tSpeed : "+speed+"\tMilage :"+milage);
	}
}

class Honda extends Automobiles
{
	Honda()
	{
		super(10,20,30);
		
	}
}

class BMW extends Automobiles
{
	BMW()
	{
		super(10,20,30);
	}
}
