package com.java.oops.basics;

import java.util.Scanner;
//
//import java.util.*;

public class UserInputsUsingJava {// 99/100

	public static void main(String[] args) {

//		Input all of your 4 subject marks of PCME

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks in PCME in integer format seperated by space:");
		int subjects = 6;
		int[] arrr = new int[subjects];// 5 [0,4]
		System.out.println(arrr.length);

		for (int i = 0; i < arrr.length; i++) {// int [0,5]
			System.out.print(arrr[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < arrr.length; i++) {// int
			arrr[i] = sc.nextInt();
		}

		System.out.println("Marks:");
		for (int i = 0; i < arrr.length; i++) {// int
			System.out.print(arrr[i] + " ");
		}
		System.out.println();
		System.out.println(arrr[arrr.length-1]);

	}
//	HW take an input of 5 Names of iceCream and reverese their order
//	vanilla starwberry choclate tootifrooto blackcurrent
//	blackcurrent tootifrooto choclate starwberry vanilla

}
