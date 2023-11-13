package com.java.basics;

public class LoopsInJava2 {

	public static void main(String[] args) {

		int x = 9;
//		WAP 1 - 200  EVEN
//		System.out.println(2);
//		System.out.println(4);

		// SCOPE OF VARIABLES
		int i = 1;
		for (; i <= 200; i++) {// intialisation;conditionals;updation
			int y = 9;
			if (i % 2 == 0)
				System.out.print(i + " ");

//			System.out.println(x);
		}

		System.out.println(i);

		// while loop
		i = 2;
		while (i <= 200) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();
		// do while
		do {//this will run atleast for one time
			System.out.println("PRINTED");
		} while (8 == 9);

	}

}
