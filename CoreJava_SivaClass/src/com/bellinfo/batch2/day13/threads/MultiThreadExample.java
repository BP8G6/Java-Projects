package com.bellinfo.batch2.day13.threads;

public class MultiThreadExample {

	public static void main(String[] args) {

		UserThread UT1 = new UserThread("Core Java");
		UserThread UT2 = new UserThread("Advanced Java");
		//UT2.run();
		//UT1.example();
		
	}

}

class UserThread extends Thread {
	private String UserThreadName;
	private UserThread ut;

	UserThread(String tname) {
		UserThreadName = tname;
		//setName(tname);
		start();
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try{
				if(getName().equals("Advanced Java") && i==4)
				{
				
				UserThread.sleep(10000);	

				System.out.println("Thread Namme : "+UserThreadName+ "Count : "+i);
				}
				else
				{

					System.out.println("Thread Namme : "+UserThreadName+ "Count : "+i);
				}
			}catch(Exception e){ 
				
			}
		}
	}
		
		public void example()
		{
			System.out.println("Ponnam Balakrishna");
		}

	}
	
	
