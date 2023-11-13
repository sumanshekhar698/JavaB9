package com.java.basics;

public class Operators {

	public static void main(String[] args) {

//		 operator | Assingment
		int x = 8;

//		Unary Oprrators
		System.out.println(x++);// post increment
		System.out.println(x);// 9

		System.out.println(--x);// pre decrement 8
		System.out.println(-++x);// -9
		System.out.println(++x);// 10
		System.out.println(x++);// 10

		System.out.println(x);// 11

//		short hand operators
		x = x * 2;
		x *= 2;
		System.out.println(x);

//		Arithmetic Opertaor + - * / %
		System.out.println(10 % 3);

//		Comparison Operators
		if (!(x % 2 == 0)) {// > < >= <= !=
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}

//		MTT
//		Bit Wise Opertaors
		System.out.println(522 & 18);// 5 to binary & 8 to binary
		System.out.println(522 | 18);// 5 to binary | 8 to binary
		System.out.println(522 ^ 18);// 5 to binary ^ 8 to binary
		System.out.println(18 ^ 18);// 5 to binary ^ 8 to binary
		System.out.println(~18);// bit flip

//		Logical AND OR
		if (x > 0) {
			if (x % 2 == 0) {
				System.out.println("Even and Higher than zero");
			}
		}

		if ((x > 0) && (x % 2 == 0)) {
			System.out.println("Even and Higher than zero");
		}

		if ((x > 0) || (x % 2 == 0)) {
			System.out.println("Even and Higher than zero");
		}

//		Ternary Operators
		System.out.println(x % 2 == 0 ? "Even" : "Odd");

	}

}
