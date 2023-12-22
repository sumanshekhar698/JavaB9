package com.java.advance.mt;

public class PrimeMinister {

	private String name;
	private int age;
	private static PrimeMinister pm;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	private PrimeMinister(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	static synchronized PrimeMinister createAPm(String name, int age) {
		if (pm == null) {
			pm = new PrimeMinister(name, age);
		}
		return pm;

	}

}
