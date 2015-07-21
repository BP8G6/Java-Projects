package com.practice.threads;

public class DaemonThread extends Thread {

	DaemonThread()
	{
		setDaemon(true);
	}
	public static void main(String[] args) {
		
		DaemonThread DT = new DaemonThread();
		//DT.setDaemon(true); // You can set Deamon Here also
		DT.start();

	}

	public void run()
	{
		System.out.println("Is this thread Daemon ? "+ isDaemon());
	}
}
