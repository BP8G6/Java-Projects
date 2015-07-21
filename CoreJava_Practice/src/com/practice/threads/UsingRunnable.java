package com.practice.threads;

class RunnableThread implements Runnable {

	public static int count =0;
	
	public void run() {
		while(RunnableThread.count<=10)
		{
			try {
				System.out.println("Expl Thread : "+ ++RunnableThread.count);				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {	
				System.out.println("Exception in Thread : "+e.getMessage());
				//e.printStackTrace();
			}
		}
		System.out.println("End Of Exceptional Thread...........!" +"Exception Thread");
		
	}

}

public class UsingRunnable
{
	public static void main(String args[])
	{
		System.out.println("Starting Main Thread......");
		RunnableThread UR =new RunnableThread();		
		Thread t = new Thread(UR);
		t.setName("Main Thread");
		t.start();
		System.out.println("Running Thread : "+t.getName());
		//t.start();
		
		while(RunnableThread.count<=10)
		{
		System.out.println(t.getName() +" : " + ++RunnableThread.count );	
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception in Main Thread : "+e.getMessage());
			//e.printStackTrace();
		}
		}

		System.out.println("End Of Main Thread...........!" +"Main Thread");
	}
}

