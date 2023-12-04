package com.java.oops.static_concept;

public class FighterJet {

	
	String name;//object level
	String engine;
	float maxSpeedInMach;

	public FighterJet(String name, String engine, float maxSpeedInMach) {

		this.name = name;
		this.engine = engine;
		this.maxSpeedInMach = maxSpeedInMach;
	}


	public String toString() {
		return "FighteJet [name=" + name + ", engine=" + engine + ", maxSpeedInMach=" + maxSpeedInMach + "]";
	}
	
	

}
