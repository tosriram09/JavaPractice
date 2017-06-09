package com.sriram.java;

public enum EnumExample {
	Apple(10), Orange (20), Banana(30);
	
	int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	EnumExample(int price) {
		this.price = price;
	}
	
	public static void main (String[] args) {
		for (EnumExample e : EnumExample.values()) {
			System.out.println("Enum value - " + e + "-" + e.getPrice());
		}
		
		System.out.println("Enum Value 2 -" + EnumExample.valueOf("Apple"));
		
		int a = 10;
		System.out.println("Before call - " + a);
		changeValue(a);
		System.out.println("After call - " + a);
	}
	
	private static void changeValue(int a) {
		a = 20;
	}
 }
