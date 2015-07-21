package com.bellinfo.batch2.day13.threads;

public class ThreadsExample {

	public static void main(String args[]) throws InterruptedException
	{
		Thread t = Thread.currentThread();
		Thread td = new Thread();		
		Thread td1 = new Thread();
		td.setName("Java");
		System.out.println("State Of the  Current Thread : "+t.getState());
		System.out.println("State Of the  New Thread : "+td.getState());
		System.out.println("Thread Name is : "+t.getName());
		System.out.println("td Name: "+td.getName());
		System.out.println("td1 Name: "+td1.getName());
		
		for(int i=0;i<=1;i++)
		{
			Thread.sleep(10);
			System.out.println("First For Loop");
		}
		
		
		for (int i=0;i<=1;i++)
		{
			Thread.sleep(10);
			System.out.println("Second For Loop");
		}
	}
}
