package com.java.advance.mt;

public class Main {

	public static void main(String[] args) {//main

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i + " " + Thread.currentThread());

				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		
	}

}
