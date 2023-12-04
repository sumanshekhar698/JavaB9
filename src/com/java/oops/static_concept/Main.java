package com.java.oops.static_concept;

public class Main {

	public static void main(String[] args) {
		FighterJet rafale1 = new FighterJet("Rafale", "Twin", 1.6f);
		rafale1.maxSpeedInMach = 1.2f;
		
		
		FighterJet rafale2 = new FighterJet("Rafale", "Twin", 1.6f);
		System.out.println(rafale2.maxSpeedInMach);
		
		System.out.println(rafale1);
	
		
//		Employee.company = "NewXCorp";
//		System.out.println(Employee.company);
		
		Employee emp1 = new Employee("EMP1", "Mary");
		emp1.company = "XCorp";
		Employee.company = "NewXCorp";
		System.out.println(emp1.company);
		Employee emp2 = new Employee("EMP2", "John");
		System.out.println(emp2.company);
		
		
//		Student.counter = -100;
		Student s1 = new Student("Tina");
		Student s2 = new Student("Mohan");
		Student s3 = new Student("Naveen");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		
		


	}

}
