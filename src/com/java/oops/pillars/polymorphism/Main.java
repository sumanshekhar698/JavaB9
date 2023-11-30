package com.java.oops.pillars.polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape.areaOfCircle(10f));
		System.out.println(shape.areaOfRectangle(10, 12));
		System.out.println(shape.areaOfSquare(10));
		System.out.println(shape.areaOfTriangle(10, 5.0f));

//		
		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.area(10));
		System.out.println(shapePolymorphic.area(10, 900.9f));
		System.out.println(shapePolymorphic.area(10.6f));

	}

}
