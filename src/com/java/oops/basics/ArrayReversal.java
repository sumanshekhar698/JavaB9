package com.java.oops.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

	public static void main(String[] args) {

		char ch = 'X';
		String name = "Java";// String Object
		String b = null;
		String c;

		System.out.println(b);

		Scanner sc = new Scanner(System.in);
		String[] namesOfIcecreams = new String[1];
		String[] icicles = namesOfIcecreams;
		
		for (int i = 0; i < namesOfIcecreams.length; i++) {
			String icecream = sc.nextLine();// Vanilla, Belgian Choclate,
			namesOfIcecreams[i] = icecream;
		}

//		for (int i = namesOfIcecreams.length - 1; i >= 0; i--) {
//			String icecream = sc.nextLine();// Vanilla, Belgian Choclate,
//			namesOfIcecreams[i] = icecream;
//		}

		System.out.println(Arrays.toString(namesOfIcecreams));

		int i = 0, j = namesOfIcecreams.length - 1;
		while (i < j) {

			// n elements in Array
//			Time O(n): n/2
//			Space O(n): 1

			// swapping logic
			String icecream = namesOfIcecreams[i];
			namesOfIcecreams[i] = namesOfIcecreams[j];
			namesOfIcecreams[j] = icecream;
			i++;
			j--;

		}

		System.out.println(namesOfIcecreams);
		System.out.println(Arrays.toString(namesOfIcecreams));
		System.out.println(Arrays.toString(icicles));
		System.out.println(icicles);
		icicles = null;
		namesOfIcecreams = null;



	}

}
