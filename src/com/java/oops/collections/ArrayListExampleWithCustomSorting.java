package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExampleWithCustomSorting {
	public static void main(String[] args) {

		int[] arr = { 32, 54, 5, 5, 543, 88 };

		ArrayList<Integer> listOfNums = new ArrayList();
		listOfNums.add(65);
		listOfNums.add(15);
		listOfNums.add(5);
		listOfNums.add(5);

		System.out.println(listOfNums);

		listOfNums.add(0, 999);
		System.out.println(listOfNums);

		Collections.sort(listOfNums, Collections.reverseOrder());
		System.out.println(listOfNums);

		ArrayList<Student> listOfStudents = new ArrayList();
		listOfStudents.add(new Student("Mary", 2));
		listOfStudents.add(new Student("Tom", 1));
		listOfStudents.add(new Student("Jill", 9));
		listOfStudents.add(new Student("Jin", 6));
		listOfStudents.add(new Student("Hiedy", 12));
//		Collections.sort(listOfStudents);
		System.out.println(listOfStudents);

		Collections.sort(listOfStudents, (s1, s2) -> {
			if (s1.roll == s2.roll)
				return 0;
			else if (s1.roll > s2.roll)
				return 1;
			else
				return -8;
		});
		System.out.println(listOfStudents);

	}

//	static class Student implements Comparable<Student> {
//		String name;
//		int roll;
//
//		public Student(String name, int roll) {
//			super();
//			this.name = name;
//			this.roll = roll;
//		}
//
//		@Override
//		public int compareTo(Student o) {
//			if (o.roll == this.roll)
//				return 0;
//			else if (o.roll < this.roll)
//				return 1;
//			else
//				return -8;
//		}
//
//		@Override
//		public String toString() {
//			return "Student [name=" + name + ", roll=" + roll + "]";
//		}
//
//	}

	static class Student {
		String name;
		int roll;

		public Student(String name, int roll) {
			super();
			this.name = name;
			this.roll = roll;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", roll=" + roll + "]";
		}

	}

}
