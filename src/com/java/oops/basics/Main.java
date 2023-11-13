package com.java.oops.basics;

public class Main {

	public static void main(String[] args) {
		int x;
		x = 9;
		System.out.println(x);
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();

		
		
		
		System.out.println(c1.mielage);
		System.out.println(c1.color);
		c1.color = "Pink";
		System.out.println(c1.color);
		System.out.println(c1.brand);
		
		c1.mielage = 15;
		c1.carryGoodss();
		c1.travel();
		
		System.out.println(c2.color);


	}

}
