package com.java.oops.basics.strings;

public class StringsIntro {

	public static void main(String[] args) {
		
		
		//IMMUTABLE STRINGS
		String x = null;// We are just declaring a Ref/Instance/Object variable
		String y = "";// String is a collection of 0 or more character

		System.out.println(y.length());// 0
		if (x != null)
			System.out.println(x.length());// NullPointer

		String str1 = "ICC WORLD CUP 2023";// Using String Literal
		String str2 = new String("ICC WORLD CUP 2023");//Using new
		String str4 = new String("ICC WORLD CUP 2023");

		String str3 = "ICC WORLD CUP 2023";
		String str5 = "ICC WORLD cup 2023";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		if (str1 == str3) {// == on two Object, This will not check
//			the value, it  will check the Object Refererence 
			System.out.println("Equal");
		} else {
			System.out.println("Un Equal");
		}

		if (str1 == str2) {
			System.out.println("Equal");
		} else {
			System.out.println("Un Equal");
		}

		if (str2 == str4) {
			System.out.println("Equal");
		} else {
			System.out.println("Un Equal");
		}

		if (str1.equals(str4)) {// To compare Value
			System.out.println("Equal VALUE");
		} else {
			System.out.println("Un Equal VALUE");
		}

		if (str3.equals(str5)) {// To compare Value
			System.out.println("Equal VALUE");
		} else {
			System.out.println("Un Equal VALUE");
		}

		if (str3.equalsIgnoreCase(str5)) {// To compare Value Ignoring Cases
			System.out.println("Equal VALUE");
		} else {
			System.out.println("Un Equal VALUE");
		}

	}

}
