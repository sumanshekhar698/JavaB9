package com.java.oops.basics.arrays.two_dimensional;

import java.util.Arrays;

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] matrix1 = { { 4, 6, 7, 8 }, { 94, 16, -7, 58 }, { 44, 61, 72, 18 }, };// Same Dimesion

		int[][] matrix2 = { { 14, 96, 17, 82 }, { 93, 146, -37, 548 }, { 444, 621, 742, 118 }, };

		int[][] matrix3 = new int[matrix1.length][matrix1[0].length];

		if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
			for (int i = 0; i < matrix1.length; i++) {//
				for (int j = 0; j < matrix1[i].length; j++) {//
					matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
		}

//		for (int i = 0; i < matrix1.length; i++) {//
//			for (int j = 0; j < matrix1[i].length; j++) {//
//				System.out.print(matrix3[i][j] + " ");
//			}
//			System.out.println();
//		}

//		System.out.println(Arrays.toString(matrix3));

		for (int i = 0; i < matrix3.length; i++) {
			System.out.println(Arrays.toString(matrix3[i]));
		}

	}

}
