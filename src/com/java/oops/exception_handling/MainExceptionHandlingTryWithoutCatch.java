package com.java.oops.exception_handling;

import java.util.Scanner;

public class MainExceptionHandlingTryWithoutCatch {

	static int num = 0;

	public static void main(String[] args) {

		System.out.println("START");
		int[] arr = { 3, 43, 5, 45, 22, 9 };

		int index = 4;
		try (Scanner sc = new Scanner(System.in);) {// try with resource
			if (index < arr.length) {
				System.out.println(arr[index / sc.nextInt()]);
			}

		} finally {

		}

//		sc.close();
		System.out.println("END");

	}

}
