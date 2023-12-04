package com.java.oops.static_concept;

public class Employee {// XCorp
	
	String id;
	String name;
	static String company;//class level variables/ static variables
	
	
	static {//blocks
		company = "About to be anounce";
		System.out.println("Block 1 static");
	}
	
	
	{//blocks
		System.out.println("Block 2");
	}
	
	static {//blocks
		System.out.println("Block 3 static");
	}
	
	{//blocks
		System.out.println("Block 4");
	}
	
	public Employee(String id, String name) {
		System.out.println("Constructor called");
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	static void sayMyCompanyName() {//you cannot directly access not static things from a static context
		System.out.println(company);
//		System.out.println(name);
	}
	
	 void sayMyName() {//
		System.out.println(company);
		System.out.println(name);
	}
	
	
	
	

}
