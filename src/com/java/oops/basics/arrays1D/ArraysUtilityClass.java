package com.java.oops.basics.arrays1D;

import java.util.Arrays;

public class ArraysUtilityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 43, 5, 25, 65, 7, 3, 4 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);// Merge Sort/ Bubble Sort
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, -1);
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 0, 3, -9);
		System.out.println(Arrays.toString(arr));

//		Bubble Sort (Descesnding Order)

	}

}
