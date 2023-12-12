package com.java.oops.interfaces.types;

@FunctionalInterface // interfaces with just a single abstract fn
public interface Country {

	String electMyPM();// 1

	default void test() {
	}

	static void test2() {
	}

}
