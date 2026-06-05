package com.statickeyword;

public class B {
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
		B.method1();
		int a = B.add(3, 9);
		System.out.println("Sum =" + a);
		B b=new B();
		b.display();
	}
}
