package com.java.oops.inheritance;

public class Player {// Object
	String name;
	int age;
	int sportsCareer;
	float height;
	Gender gender;
	private int secretCode;// private variable and fn cannot get inherited

	public Player(String name, int age, int sportsCareer, float height, Gender gender) {
		super();
		System.out.println("Player(parameterized)");

		this.name = name;
		this.age = age;
		this.sportsCareer = sportsCareer;
		this.height = height;
		this.gender = gender;
	}

	Player() {
		System.out.println("Player()");
	}

	void sayMyName() {
		System.out.println(name);
	}

	
//	final void test() {//final methods cannot be overidden
	 void test() {
		System.out.println("test 1");
	}

}
