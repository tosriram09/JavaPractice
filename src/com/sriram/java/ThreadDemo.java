package com.sriram.java;

public class ThreadDemo {
	public static void main(String[] args) {
		new NewThread();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			System.out.println("Main Thread Interrupted");
		}
	}
}