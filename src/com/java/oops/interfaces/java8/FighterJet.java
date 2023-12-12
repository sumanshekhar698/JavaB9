package com.java.oops.interfaces.java8;

public interface FighterJet {

	String NAME = "Dasssault Rafale";// p s f

	float getTopSpeed();

	static boolean isWeaponLoaded() {// static fn
		return true;
	}

	default String countryOrigin() {// default fn
		return "France";
	}

}
