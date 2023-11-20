package com.java.oops.basics.strings.mutable;

public class BattleOfStrigs {

	public static void main(String[] args) {

//		String x = "tom";
//		long start = System.nanoTime();
//		for (int i = 0; i < 100000; i++) {
//			x += "Jerry";
//		}
//		long end = System.nanoTime();
//		System.out.println("Time Diff :: " + (end - start));//Time Diff :: 43,900,481,900 = 43.9 seconds

		StringBuilder x = new StringBuilder("tom");// Mutations a big File
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			x.append("Jerry");
		}
		long end = System.nanoTime();
		System.out.println("Time Diff :: " + (end - start));// Time Diff :: 019,671,301 = 0.02 seconds

	}

}
