package com.bellinfo.batch2.day14.threads;

public class SynchronizationExample {

	public static void main(String[] args) {
		 
		Increment inc = new Increment();
		Increment inc1 =new Increment();
		SyncScenario1 coreThread = new SyncScenario1("Core",inc);
		SyncScenario1 advThread = new SyncScenario1("Advanced",inc1);
	}

}

class SyncScenario1 extends Thread
{
	Increment iclocal;
	SyncScenario1(String tname,Increment ic)
	{	
		setName(tname);
		iclocal =ic;
		start();
	}
	
	public void run()
	{
		System.out.println("Thread Started : "+getName());
		synchronized(iclocal)
		{
		iclocal.incMethod(getName());
		}
		System.out.println("Thread Ended : "+getName());
	}
}

class Increment 
{static int a =0;
	public void incMethod(String name)
	{
		for(int i=0;i<=5;i++){
			System.out.println("Increment Class : Thread Name : "+name+ " Count : "+i);
			System.out.println("Balakrishna  :  "+  a++);
		}
	}
	
}