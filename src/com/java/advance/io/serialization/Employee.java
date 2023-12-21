package com.java.advance.io.serialization;

import java.io.Serializable;

public class Employee implements Serializable{//Marker Interface

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	transient int id;
	String org;
	static String companyCode;//static and transient thing dont get serialized

	public Employee(String name, int id, String org) {
		super();
		this.name = name;
		this.id = id;
		this.org = org;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", org=" + org + "]";
	}

}
