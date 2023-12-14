package com.java.oops.exception_handling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			boolean ans = eligibleForVoting(age);
			System.out.println(ans);
		} catch (InvalidAgeForVoting e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static boolean eligibleForVoting(int age) throws InvalidAgeForVoting {
		if (age >= 18 && age < 130)
			return true;
		else if (age < 18 && age > 0) {
			throw new InvalidAgeForVoting("Under Age");
		} else {
			throw new InvalidAgeForVoting("Invalid Age Value");
		}

	}

}

class InvalidAgeForVoting extends Exception {// 1

	public InvalidAgeForVoting(String message) {
		super(message);
	}

}
