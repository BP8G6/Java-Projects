package com.practice.threads;

public class Sample {

	public static void main(String[] args) {
		Example e = new Example();
		Thread t = new Thread("Balu Thread");
		Thread t1 = new Thread("Java Thread");
		
		Thread RT = new Thread(e);
		Thread t2 = new Thread(e);
		RT.start();
				
		System.out.println("Running thread Name is : "+Thread.currentThread().getName());		
		System.out.println("Running Thread Status is : "+t.getName());
		System.out.println("Running Thread Status is : "+t1.getName());
		
		try {
			t2.wait(10000);			
		} catch (Exception e1) {
			System.out.println("Exception For Wait in main method.....!");			
		}		
		//t2.start(); 
		
	}
}

class Example implements Runnable
{
	public void run()
	{	
		System.out.println("Current Thread in Run Method : "+Thread.currentThread().getName());
		System.out.println("In Run Class");
		try{
		notify();
		}
		catch(Exception e)
		{System.out.println("Exception for notify in run method");}
	}
	
	
}