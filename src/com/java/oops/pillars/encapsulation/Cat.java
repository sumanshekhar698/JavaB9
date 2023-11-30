package com.java.oops.pillars.encapsulation;

public class Cat {

	private String color;
	String breed;

	String getColor() {
		return this.color;
	}
	
	
	
	

	public void setColor(String color) {
		this.color = color;
	}





	private void sayMyColor() {
		System.out.println(this.color);
	}

	public Cat(String color, String breed) {

		this.color = color;
		this.breed = breed;
	}

}
