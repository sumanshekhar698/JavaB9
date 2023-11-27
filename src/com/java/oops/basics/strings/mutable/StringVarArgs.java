package com.java.oops.basics.strings.mutable;

import java.util.Arrays;

public class StringVarArgs {

	public static void main(String ... suman) {
		System.out.println("Hey");
		System.out.println(suman.length);
		System.out.println(suman[0]);
		System.out.println(Arrays.toString(suman));
		test(0, 899, 8, 99, 00, 8, 98, 99);

	}

	static void test(int... x) {// var args
		System.out.println(Arrays.toString(x));


	}

}
