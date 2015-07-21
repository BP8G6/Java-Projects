package com.practice.threads;

import java.util.ArrayList;
import java.util.List;

public class JoinThread {
	public static List<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		List<SampleThread> list = new ArrayList<SampleThread>();
		for (int i = 0; i <= 5; i++) {
			SampleThread s = new SampleThread();
			list.add(s);
			s.start();
		}
		for (SampleThread st : list) {
			try {
				st.join();
			} catch (Exception ex) {
			}
		}
		System.out.println(names);
	}

}

class SampleThread extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Exception in Exceptional Thread..!");
				// e.printStackTrace();
			}
		}
        JoinThread.names.add(getName());
	}
}