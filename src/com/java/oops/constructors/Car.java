package com.java.oops.constructors;

public class Car {

	String color;
	float mielage;
	String brand;
	int warranty;
	boolean hasInsurance;

	void travel() {
		System.out.println("Travelling via car at mielage " + mielage);
	}

	void carryGoodss() {
		System.out.println("Carrying Goods");
	}

	// 1

//	DSA
	Car() {

	}

	public Car(String color, float mielage, String brand, int warranty, boolean hasInsurance) {// parameter constructor
		this(color, mielage, brand, warranty);// constructor chaining
		System.out.println("Car paramter  constructor called 2");

		this.color = color;
		this.mielage = mielage;
		this.brand = brand;
		this.warranty = warranty;
		this.hasInsurance = hasInsurance;
	}

	public Car(String color, float mielage, String brand, int warranty) {// parameter constructor
		this();
		System.out.println("Car paramter  constructor called 3");
		this.color = color;
		this.mielage = mielage;
		this.brand = brand;
		this.warranty = warranty;
	}
	
	Car getMyRef(){
		return this;
	}
	
	//Polyomorphism, Encapsulation
	

}
