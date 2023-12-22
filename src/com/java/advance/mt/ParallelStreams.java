package com.java.advance.mt;

import java.util.ArrayList;

public class ParallelStreams {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList() {{
			add(5);
			add(15);
			add(52);
			add(-5);
			add(51);
		}};
		al.stream().forEach(System.out::println);

		al.parallelStream().forEach(System.out::println);//The orde4r will be jumbled up

	}

}
