package com.runnableinterface;

public class InBulidMethod extends Thread {
	public void run() {// run methode wher we write logic
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hi");
			Thread.yield();
		}
	}

	public void m1() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

			}
			System.out.println("Hello");
		}
	}

	public void m2() {
		System.out.println("Thread name =" + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {

		InBulidMethod ib = new InBulidMethod();

		ib.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
