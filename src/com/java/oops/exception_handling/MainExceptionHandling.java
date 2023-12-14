package com.java.oops.exception_handling;

public class MainExceptionHandling {

	static int num = 0;

	public static void main(String[] args) {

		System.out.println("START");
		int[] arr = { 3, 43, 5, 45, 22, 9 };
		int index = 6;
		try {
//			if (index < arr.length) {
			System.out.println(arr[index / 1]);
//			}
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();//DRY

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {// default exception block
			e.printStackTrace();
		}
		


		System.out.println("END");

	}

	private static void call() {
		System.out.println(++num);
		call();
		System.out.println("call finished");
	}

}
