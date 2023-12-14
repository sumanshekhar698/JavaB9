package com.java.oops.exception_handling;

import java.util.Scanner;

public class MainExceptionHandlingWithFinally {

	static int num = 0;

	public static void main(String[] args) {

		System.out.println("START");
		int[] arr = { 3, 43, 5, 45, 22, 9 };
		Scanner sc = new Scanner(System.in);
		int index = 4;
		try {
			if (index < arr.length) {
				System.out.println(arr[index / sc.nextInt()]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {// cleanup
			System.out.println("FInally!");
			sc.close();
		}

//		sc.close();
		System.out.println("END");

	}


}
