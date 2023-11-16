package com.java.oops.basics.arrays1D;

import java.util.Arrays;

public class ArrayCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 43, 65, 76, 12, 87, 43 };
//		int arr2[] = arr;
//		Arrays.fill(arr2, -1);
//		System.out.println(Arrays.toString(arr));

		// Manual Deep Copy/ Cloning
		int[] arr3 = new int[arr.length];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr[i];
		}
		Arrays.fill(arr3, -1);
		System.out.println(Arrays.toString(arr));
		
		//Automatic cloning
		int[] arr4 = arr.clone();//1D arrays
		Arrays.fill(arr4, -1);
		System.out.println(Arrays.toString(arr));

	}

}
