package com.java.oops.basics.strings.mutable;

public class MutableStrings {

	public static void main(String[] args) {

//StringBuilder StringBuffer

		StringBuilder sb = new StringBuilder();
		sb.append(" hey");
		sb.append(" hey \n");
		sb.append(" hey");
		System.out.println(sb);
		
		//StringBuilder is prferred in Single Thred env
		//StringBuffer is prferred in Multi Thred env


	}

}
