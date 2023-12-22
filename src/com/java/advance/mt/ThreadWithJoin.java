package com.java.advance.mt;

public class ThreadWithJoin {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START :: " + Thread.currentThread() + " STATE => " + Thread.currentThread().getState());
		Worker w1 = new Worker();
		w1.setName("w1");
		System.out.println("w1 :: " + w1 + " STATE => " + w1.getState());
		w1.start();
		w1.join();
		System.out.println("w1 :: " + w1 + " STATE => " + w1.getState());
		
//		Thread.sleep(10000);
		System.out.println("END :: " + Thread.currentThread() + " STATE => " + Thread.currentThread().getState());

	}

}
