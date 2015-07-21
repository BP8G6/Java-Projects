package com.practice.threads;


class RunThread extends Thread
{
	public static int count =0;
	
	public void run()
	{
		while(RunThread.count<=10)
		{
			System.out.println("Exception Thread : "+ ++RunThread.count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				//e.printStackTrace();
				System.out.println("Exception in Thread Exception.....!");
			}
		}
		System.out.println("End of Exception Thread.............!Exception Thread");
	}
	
}


public class ExtendingThread {

	public static void main(String[] args) {
		
		RunThread RT = new RunThread();
		System.out.println("Running Main Thread.....!In Main Method");
		RT.start();
		while(RT.count<=10)
		{
			System.out.println("Main Thread : "+ ++RT.count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception in Thread Mian...........! ");
				//e.printStackTrace();
			}
		}
		System.out.println("End of Main Thread.............!Main Thread");
	}

}
