package com.java.oops.static_concept;

public class Student {// XCorp
	
	String id;
	String name;
	static String collegeName;//class level variables/ static variables
	static private int counter = 0;
	
	
	
	
	private Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public Student( String name) {
		this.name = name;
		this.id = "EMP"+ ++counter;
		//STD1
//		STD2
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



	
	
	
	

}
