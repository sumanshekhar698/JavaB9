package com.java.oops.pillars.encapsulation;

public class Main {

	public static void main(String[] args) {

		Cat cat = new Cat("Grey", "Bengal Cat");
//		cat.color = "Pink";
		cat.setColor("Brown");
		System.out.println(cat.getColor());

	}

}
