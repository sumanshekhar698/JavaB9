package com.java.oops.basics.arrays.two_dimensional;

public class Jagged2DArray {

	public static void main(String[] args) {
		int [][] jaggedMatrix = {
				{32,5,63,5},
				{54,2,85,2,4,5},
				{12,4}
		};
		
		for (int i = 0; i < jaggedMatrix.length; i++) {//
			for (int j = 0; j < jaggedMatrix[i].length; j++) {//
				System.out.print(jaggedMatrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
