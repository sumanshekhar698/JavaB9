package com.java.oops.basics.strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str1 = "   iCC worlD CuP 2023   ";
		str1 = str1.trim();
		System.out.println(str1);

		String str2 = new String("  iCC worlD CuP 2023   ");
		String str3 = str2.trim().toUpperCase().toLowerCase();// Method Chaining
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(str2.toLowerCase().trim());

		String str5 = "ABC DEF GHI";
		System.out.println(str5.substring(2));
		System.out.println(str5.substring(2, 7));

		System.out.println(str5);
//		StringTokenizer stringTokenizer = new StringTokenizer(str5," ");
//		while (stringTokenizer.hasMoreTokens()) {
//			System.out.println(stringTokenizer.nextToken());
//		}

		String[] split = str5.split(" ");
		System.out.println(Arrays.toString(split));

		System.out.println(str5.charAt(4));
		str5 = "";
		System.out.println(str5.isEmpty());
		str5 = str5.concat(" We love team INDIA");
		str5 = str5.concat(" from out heart");

		str5 += " :) ";

		System.out.println(str5);

	}

}
