package com.java.basics;

public class LoopsInJava {

	public static void main(String[] args) {

		int x = 9;
//		while (8==8) {
//			System.out.println("STOP ME IF YOU CAN!!");
//		}

//		for (;;) {
//			System.out.println("STOP ME IF YOU CAN!!");
//		}

		for (int i = 0; i < 100; i += 2) {//6 iterations
			System.out.print(i + " ");

			if (i * i == 100) {
				break;
			}

		}
		
		System.out.println();

		for (int i = 0; i < 100; i += 2) {
			if (i * i == 100) {
				continue;
			}
			System.out.print(i + " ");

		}
	}

}
