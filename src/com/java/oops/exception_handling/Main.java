package com.java.oops.exception_handling;

public class Main {

	static int num = 0;

	public static void main(String[] args) {

		System.out.println("START");
		int[] arr = { 3, 43, 5, 45, 22, 9 };
		int index = 1;
		if (index < arr.length) {
			System.out.println(arr[index / 0]);
		}

//		try {
//			System.out.println(arr[6]);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		call();
		System.out.println("END");

	}

	private static void call() {
		System.out.println(++num);
		call();
		System.out.println("call finished");
	}

}
