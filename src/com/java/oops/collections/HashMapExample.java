package com.java.oops.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
//		K:V
		HashMap<Integer, String> map = new HashMap<>();// Key will ba hashed so no duplicate Keys
		map.put(2, "Amy");
		map.put(4, "Mary");
		map.put(2, "John");
		map.put(1, "Linda");
		map.put(7, "Zayn");
		map.put(-1, "Linda");
		System.out.println(map);

		System.out.println(map.get(-1));
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		map.entrySet().stream().forEach(System.out::println);

	}

}
