package com.java.oops.basics.arrays.two_dimensional;

import java.util.Arrays;

public class CloningIn2DArray {

	public static void main(String[] args) {
		int[][] matrix1 = { { 4, 6, 7, 8 }, { 94, 16, -7, 58 }, { 44, 61, 72, 18 }, };
//		int[][] clone = matrix1.clone();
//		Arrays.fill(clone[0], -99);
		
		int [][] clone = new int [matrix1.length][];
		for (int i = 0; i < clone.length; i++) {
			clone[i] = matrix1[i].clone();
		}
		Arrays.fill(clone[0], -99);
//
		System.out.println(Arrays.toString(matrix1[0]));

	}

}
