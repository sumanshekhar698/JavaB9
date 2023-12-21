package com.java.oops.collections;

import java.util.HashMap;

public class ShowMeTheOccuraenceOfEachCharacterOfAString {

	public static void main(String[] args) {
		String s = "aFlAatOon";

		String lowerCase = s.toLowerCase();

		HashMap<Character, Integer> map = new HashMap();

//		for (int i = 0; i < lowerCase.length(); i++) {
//			char ch = lowerCase.charAt(i);
//			if(map.containsKey(ch)) {//O(1)
//				Integer value = map.get(ch);
//				map.put(ch, ++value);
//			}else {
//				map.put(ch, 1);
//			}
//		}

		for (int i = 0; i < lowerCase.length(); i++) {
			char ch = lowerCase.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println(map);
	}

}
