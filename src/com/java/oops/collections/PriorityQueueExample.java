package com.java.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> queue = new PriorityQueue();// Min Heap
		queue = new PriorityQueue(Collections.reverseOrder());// Min Heap

		queue.add(55);
		queue.add(15);
		queue.add(5);
		queue.add(-55);
		queue.add(-155);

		queue.add(5);
		System.out.println(queue);

		queue.poll();
		System.out.println(queue);

		queue.poll();
		System.out.println(queue);

		queue.poll();
		System.out.println(queue);

		queue.poll();
		System.out.println(queue);

		Integer poll = queue.poll();
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue);


	}

}
