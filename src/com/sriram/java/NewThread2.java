package com.sriram.java;

public class NewThread2 extends Thread {
	NewThread2() {
		super("Demo Thread");
		System.out.println("Child Thread :" + this);
		start();
	}
	
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException ie) {
			System.out.println("Child Thread Interrupted");
		}
	}
}