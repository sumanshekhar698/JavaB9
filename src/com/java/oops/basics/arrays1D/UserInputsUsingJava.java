package com.java.oops.basics.arrays1D;

import java.util.Scanner;
//
//import java.util.*;

public class UserInputsUsingJava {//99/100

	public static void main(String[] args) {

//		i/p
//		1. Take your name
//		2. Input all of your 4 subject marks of PCME
//		3. School

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Full Name:");
		String fullName = sc.nextLine();//String i/p

		int sum = 0;
		System.out.println("Enter your marks in PCME in integer format seperated by space:");
		for (int i = 1; i <= 4; i++) {//int
			int marks = sc.nextInt();
			sum += marks;
		}

		float percentage = (sum / 4);//
		System.out.println("Enter your School Name:");
//		int
		sc.nextLine();//dummy input (Flushing)
		String schoolName = sc.nextLine();//String

//		o/p
//		Hi, name
//		You have scored an percentage of {percentage}
//		You are enrolled in {school name}
		System.out.println("Hi: " + fullName);
		System.out.println("You have scored an percentage of: " + percentage);
		System.out.println("You are enrolled in school name: " + schoolName);
		
		sc.close();

	}

}
