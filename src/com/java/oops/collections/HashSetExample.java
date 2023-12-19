package com.java.oops.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList() {
			{
				add(3);
				add(13);
				add(33);
				add(3);
				add(33);
			}
		};

		Set<Integer> collect = list.stream().collect(Collectors.toSet());
		System.out.println(collect);

		HashSet<Integer> set = new HashSet() {
			{
				add(3);
				add(13);
				add(33);
				add(3);
				add(33);
			}
		};
		System.out.println(set);
		boolean contains = set.contains(33);// 33--> fn --> 785a Seaching is very fast

		set.add(44);
		set.add(14);
		set.add(4);
		System.out.println(set);// order is on maintianmed :: LinkedHashSet

	}

}
