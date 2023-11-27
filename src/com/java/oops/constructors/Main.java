package com.java.oops.constructors;

public class Main {

	public static void main(String[] args) {
//		Car c1 = new  Car();
		Car c2 = new Car("Red", 10.5f,"Bugati",2,true);
		System.out.println(c2.color);
		System.out.println(c2);
		System.out.println(c2.getMyRef());

	}

}
