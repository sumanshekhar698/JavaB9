package com.java.oops.exception_handling;

public class CheckedVsUncheckedExceptions {

	public static void main(String[] args) {

//		UNCHECKED EXCEPTIONS
		int arr[] = { 32, 45, 65 };
//		System.out.println(arr[-1]);//java.lang.ArrayIndexOutOfBoundsException 

//		CHECKED EXCEPTIONS
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);//checked
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);

		}

	}

}
