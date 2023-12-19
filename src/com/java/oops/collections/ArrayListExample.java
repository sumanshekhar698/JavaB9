package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {

		int[] arr = { 32, 54, 5, 5, 543, 88 };

		ArrayList list = new ArrayList();// Colection can only store Objects
		list.add(2);
		list.add(true);
		list.add("hey!");

		System.out.println(list);

		ArrayList<Integer> listOfNums = new ArrayList();
		listOfNums.add(65);
		listOfNums.add(15);
		listOfNums.add(5);
//		listOfNums.add(null);
		listOfNums.add(5);

		System.out.println(listOfNums);

		listOfNums.add(0, 999);
		System.out.println(listOfNums);

//		for (int i = 0; i < listOfNums.size(); i++) {
//			listOfNums.add(i);
//			System.out.println(listOfNums.get(i));
//		}

		for (Integer num : listOfNums) {
//			listOfNums.add(0);
			System.out.println(num);
		}

		Iterator<Integer> itr = listOfNums.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();
			System.out.println(num);
		}

//		listOfNums.clear();
//		System.out.println(listOfNums);
		Collections.sort(listOfNums);
		;
		System.out.println(listOfNums);

		Collections.sort(listOfNums, Collections.reverseOrder());
		System.out.println(listOfNums);
		
		Collections.shuffle(listOfNums);
		System.out.println(listOfNums);
		
		boolean contains = listOfNums.contains(5);
		System.out.println(contains);
		
		listOfNums.set(1, -9999);
		System.out.println(listOfNums);
		
		listOfNums.stream().filter(x -> x >=0).forEach(System.out::println);;


	}

}
