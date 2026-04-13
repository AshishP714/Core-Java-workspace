package com.statickeyword;

public class B {
//by making static method 
	public static void method1() {
		System.out.println("This is method1 from static method");
	}

	public static int add(int a, int b) {
		int c = a + b;
		return c;

	}
	public void display() {
		System.out.println("This is non static method");
	}

	public static void main(String[] args) {
		B.method1();// no need to create object
		int a = B.add(3, 9);
		System.out.println("Sum =" + a);
		//B.display(); this is not allowed to call
		B b=new B();
		b.display();//for to call non static method we need to create object creation

	}
}
