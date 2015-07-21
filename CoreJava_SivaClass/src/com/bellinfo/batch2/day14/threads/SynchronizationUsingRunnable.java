package com.bellinfo.batch2.day14.threads;

public class SynchronizationUsingRunnable {

	public static void main(String[] args) {

		Increment1 inc = new Increment1();
		Increment1 inc1 = new Increment1();
		SyncScenario2 coreThread = new SyncScenario2("Core", inc);
		SyncScenario2 advThread = new SyncScenario2("Advanced", inc1);
		Thread t=new Thread("Core");
	}

}

class SyncScenario2 implements Runnable {
	Thread t;
	Increment1 iclocal;
	//SyncScenario2 coreThread1 = new SyncScenario2("Core",iclocal);
	SyncScenario2(String tname, Increment1 ic) {
		t = new Thread(null,this, tname);
		//t = new Thread(null,this, tname);
		t.setName(tname);
		iclocal = ic;
		t.start();
	}

	public void run() {
		System.out.println("Thread Started : " + t.getName());
		synchronized (iclocal) {
			iclocal.incMethod1(t.getName());
		}
		//iclocal.incMethod(t.getName());
		System.out.println("Thread Ended : " + t.getName());
	}
}

class Increment1 {
	static int a=0;
	public void incMethod1(String name) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Increment Class : Thread Name : " + name
					+ " Count : " + i);
			//System.out.println("Balakrishna");
			
		}
	}

}
