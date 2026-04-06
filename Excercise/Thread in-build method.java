package com.runnableinterface;

public class InBulidMethod extends Thread {
	public void run() {// run methode wher we write logic
		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(300);//used to stop execution of thread for particular time slot
//			} catch (InterruptedException e) {
//				
//			}
			System.out.println("Hi");
			Thread.yield();// used to paused current thread and give chance another thread to executes
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

	// Thread.currentThread()it is static method used to return the refrence of
	// current thread
	public static void main(String[] args) throws InterruptedException {
		// InBulidMethod in=new InBulidMethod();
		// System.out.println(in.start()); can nnot print method insides syso because
		// our mwthod return nothing
		// in syso we only print when method return something any string, number
//		in.start();//internally create new thread and call run method
//		try {
//			in.join();//stop execution of m1 method untill start method execute
//		} catch (InterruptedException e) {
//			
//		}
//		in.m1();
		InBulidMethod ib = new InBulidMethod();

		// ib.setName("PayalThread");
//		System.out.println("Before start ="+ib.isAlive());
//		ib.start();
//		System.out.println("After start ="+ib.isAlive());
		// ib.m3();
//		ib.m1();
//		ib.join();//used to make one thread to wait until the first thread complete execution  
//		ib.m2();
		ib.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}

	}

}
