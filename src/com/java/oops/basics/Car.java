package com.java.oops.basics;

public class Car {

//	 instance/object variables
	String color;//null  
	float mielage;//0.0
	String brand = "Skoda";
	int warranty;//0
	boolean hasInsurance;//false

	void travel() {
		System.out.println("Travelling via car at mielage " + mielage);
	}

	void carryGoodss() {
		System.out.println("Carrying Goods");
	}

}
