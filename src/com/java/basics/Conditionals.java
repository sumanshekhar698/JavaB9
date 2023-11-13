package com.java.basics;

public class Conditionals {

	public static void main(String[] args) {

		int x = 98;
		if ((x > 0) && (x % 2 == 0)) {
//			if (x % 2 == 0) {
			System.out.println("OK");
//			}
		} else {
			System.out.println("NOT OK");
		}

		x = 8;
		if (x >= 0 && x <= 5) {
			System.out.println("0 to 5");
		} else if (x >= 6 && x <= 10) {
			System.out.println("6 to 10");
		} else if (x >= 11 && x <= 15) {
			System.out.println("11 to 15");
		} else {
			System.out.println("NOT within range");
		}

		if (x >= 0 && x <= 5) {
			System.out.println("0 to 5");
		}
		if (x >= 6 && x <= 10) {
			System.out.println("6 to 10");
		}
		if (x >= 11 && x <= 15) {
			System.out.println("11 to 15");
		} else {
			System.out.println("NOT within range");
		}

	}

}
