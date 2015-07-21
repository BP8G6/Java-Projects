package core.java.assignment3;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW bmw = new BMW();
		bmw.color ="Black";
		bmw.speed =100;
		bmw.disttrav =2500;
		bmw.price =1000000;
		bmw.Runson();		
		bmw.features();
		bmw.run();
		bmw.distanceTravelled();
		bmw.price();
		
		System.out.println("===================================================================");
		Honda h=new Honda();
		h.color ="White";
		h.speed=150;
		h.disttrav = 3000;
		h.price=2000000;
		h.Runson();	
		h.features();
		h.run();
		h.distanceTravelled();
		h.price();
		
	}

}

class Car
{
	String color;
	int speed,disttrav,price;
	
	public void Runson()
	{
		System.out.println("This Car Runs on Road");
	}
	
	public void features()
	{
		System.out.println("Features of this Car are:");
		System.out.println("Brakes\tAc\tAirBag\tSpeedoMeter");

	}
	
	
}

class BMW extends Car
{
	public void run()
	{
		System.out.println("BMW Car is running with speed: "+speed);
	}
	public void distanceTravelled()
	{
		System.out.println("BMW Car Travelled distance is: "+disttrav);
	}
	public void price()
	{
		System.out.println("Price of BMW Car is: "+price);
	}
	
}

class Honda extends Car
{
	public void run()
	{
		System.out.println("Honda Car is running with speed: "+speed);
	}
	
	public void distanceTravelled()
	{
		System.out.println("Honda Car Travelled distance is: "+disttrav);
	}
	public void price()
	{
		System.out.println("Price of Honda Car is: "+price);
	}
}