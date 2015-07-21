package com.practice.threads;

public class UsingMethods {	

	public static void main(String[] args) {
		
		Threads UM = new Threads();
		
		Thread t = new Thread(UM);
		//t.run();
		System.out.println("This is method in Main class : "+t.currentThread().getName());
		t.start();
		while(UM.count<10)
		{
			
			try {				
				System.out.print("Running thread Name is\t");
				System.out.println(t.currentThread().getName()+"\tCount ="+ ++UM.count);
				//t.wait();
			} catch (Exception e) {//InterruptedException e
				System.out.println("Interrupted Exception for method Wait");
				//e.printStackTrace();
			}
			
		}
	}

}

class Threads implements Runnable
{
public static int count = 0;	
int num =10;
	public void run() {
		//while(count<=10)
		if(count<10)
		{		
			System.out.print("Running thread in Implements class is\t");
			System.out.println("\tCount ="+ ++Threads.count);
			//System.out.println(""+ ++Threads.count);
			System.out.println("This is the method in run" );
		}
		
		
	}
	public void x()
	{
		
	}
	
}
