package com.java.oops.exception_handling;

public class ExceptionPropagation {// strictfp

	public static void main(String[] args) throws InterruptedException {//DEH
//		int x = (int) (0 / 0.0f);
//		System.out.println(x);
//		System.out.println(0 / 0.0);
//		if (0 == 0.0) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

		callA();

	}

	private static void callA() throws InterruptedException {
		System.out.println("A");
		callB();
	}

	private static void callB() throws InterruptedException {
		System.out.println("B");

		callC();
	}

	private static void callC() throws InterruptedException {
		System.out.println("C");
		int x = (int) (0 / 0.0f);
//		System.out.println(8/0);

		Thread.sleep(1000);

	}

}
