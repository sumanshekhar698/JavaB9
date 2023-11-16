package com.java.oops.basics.arrays.two_dimensional;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		int[][] matrix = new int[4][3];
		
		for (int i = 0; i < matrix.length; i++) {//
			for (int j = 0; j < matrix[i].length; j++) {//
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
