package com.java.oops.basics.arrays1D;

import java.util.Arrays;

public class PassByValueVsReference {

	public static void main(String[] args) {

		int[] arr = { 43, 5, 25, 65, 7, 3, 4 };
		System.out.println(arr.length);
		int x = 88;
		change(arr, x);
		System.out.println(x);//88
		System.out.println(Arrays.toString(arr));//{ -1000, 5, 25, 65, 7, 3, 4 }
	}

	static void change(int[] arr, int x) {
		x = 999;
		arr[0] = -1000;

	}

}
