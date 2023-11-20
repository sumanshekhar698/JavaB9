package com.java.oops.basics.strings.mutable;

public class PalindromString {

	public static void main(String[] args) {
		String x = "RADARA";

		// 1. Reverse a String and store it somwhere to compares using 2 strings

//		int i = 0;
//		int j = x.length() - 1;
//		boolean isPalindrome = true;
//		while (i <= j) {
//			if (x.charAt(i) != x.charAt(j)) {
//				isPalindrome = false;
//				break;
//			}
//			i++;
//			j--;
//
//		}
//		
//		if (isPalindrome)
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not Palindrome");
		
		StringBuilder sb = new StringBuilder(x);
		System.out.println(x.equals(sb.reverse().toString()));

	}

}
