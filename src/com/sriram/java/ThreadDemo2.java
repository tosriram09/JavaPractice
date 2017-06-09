package com.sriram.java;

public class ThreadDemo2 {

	public static void main(String[] args) {
		new NewThread2();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Inside the main thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			System.out.println("Main thread interrupted");
		}
	}
}
