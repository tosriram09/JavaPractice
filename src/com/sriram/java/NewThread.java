package com.sriram.java;

public class NewThread implements Runnable {
	Thread t;

	public NewThread() {
		t = new Thread(this, "Child Thread..");
		t.start();
	}

	@Override
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
