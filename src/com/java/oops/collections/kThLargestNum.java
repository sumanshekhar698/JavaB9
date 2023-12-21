package com.java.oops.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class kThLargestNum {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 6, 54, 3, 64, 5, 4, 4, 54, 454, 64, -4343, 344 };
		int ans = kThLargest(arr, 4);
		System.out.println(ans);

	}

	private static int kThLargest(int[] arr, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());//EXTRA SPACE
		for (int num : arr) {//logn
			queue.add(num);
		}

		for (int i = 1; i <= k - 1; i++) {
			queue.poll();
		}

		return queue.poll();

	}

	private static int kThLargestOLD(int[] arr, int k) {
		Arrays.sort(arr);// nlogn
		return arr[arr.length - k];
	}

}
