package com.java.oops.pillars.polymorphism;

public class ShapePolymorphic {//
	
	
//	1 Compile Time Polymorphism
//	2 Runtime Time Polymorphism

	// Polymorphism
	// If they(Functions) have same name
//	prameter type
//	no of params
//	param posn

	int area(int side) {//area is overloaded | METHOD OVERLOADING ==>  Compile Time Polymorphism
		return side * side;
	}

	double area(float radius) {
//		return 3.14159f * radius * radius;
		return Math.PI * radius * radius;
	}

	int area(int length, int breadth) {
		return length * breadth;
	}

	float area(int base, float height) {
		return 0.5f * base * height;
	}

	float area(float height, int base) {//parallelogram
		return base * height;
	}

}
