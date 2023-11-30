package com.java.oops.pillars.polymorphism;

public class Shape {

	int areaOfSquare(int side) {
		return side * side;
	}

	double areaOfCircle(float radius) {
//		return 3.14159f * radius * radius;
		return Math.PI * radius * radius;
	}

	int areaOfRectangle(int length, int breadth) {
		return length * breadth;
	}

	float areaOfTriangle(int base, float height) {
		return 0.5f * base * height;
	}



}
