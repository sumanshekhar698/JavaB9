package com.java.oops.interfaces.types;

public class Main {

	public static void main(String[] args) {
		// create implementaion class
		// using Annonymous InnerType

		Country pmOfIndia = () -> {
			return "PM Modi";
		};//Lambda Fn applicable to Functional Interface
		
		String pm = pmOfIndia.electMyPM();
		System.out.println(pm);

	}

}
