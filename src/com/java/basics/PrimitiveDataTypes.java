package com.java.basics;

import java.util.Scanner;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
//		integers  -2^(n-1)  to 2^(n-1) - 1
		
		byte a = 9;//1 byte = 8 bits  
		short b = 89;//2 bytes = 16 bits
		int c = 868;//4 bytes = 32 bits
		long d = 868;//8 bytes = 64 bits
		
//		short phoneNo = (short)7992256124l;
//		System.out.println(phoneNo);
		
//		short phoneNo = 7992256124;
		long phoneNo = 7992256124L;
		System.out.println(phoneNo);
		
//		float (Decimals)
		float e = 2.73f;
		double pi = 3.14;
		
//		boolean
		boolean isJavaEasy = false;//1 bit
		isJavaEasy = true;
		
//		character
		char aChar = 'A';
		System.out.println(aChar);
		int ASCIIa = aChar;
		System.out.println(ASCIIa);
		
		char rupee = '₹';
		System.out.println((int)rupee);
		System.out.println((char)836738);
		

		

	}

}
