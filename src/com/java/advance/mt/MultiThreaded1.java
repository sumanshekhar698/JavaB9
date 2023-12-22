package com.java.advance.mt;

public class MultiThreaded1 {

	public static void main(String[] args) {
		System.out.println("START");
		Worker w1 = new Worker();// Thread0
		Worker w2 = new Worker();// Thread1
		Worker w3 = new Worker();// Thread2
		Thread w4 = new Thread(new Work());
		Thread w5 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(i + " " + Thread.currentThread());

					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		w1.setName("w1");
		w1.setPriority(Thread.MAX_PRIORITY);// 1....5....10
		w2.setName("w2");
		w3.setName("w3");
		w4.setName("w4");
		w4.setPriority(1);
		
		
		w5.start();
		w1.start();
		w2.start();
		w3.start();
		w4.start();

		System.out.println("END");

	}

}

class Worker extends Thread {

	@Override
	public void run() {// Work
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

class Work implements Runnable {// Work

	@Override
	public void run() {
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
