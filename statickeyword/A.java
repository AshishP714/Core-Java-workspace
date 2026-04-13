package com.statickeyword;

public class A {
//by making static variable
	static int age = 22;// static variable

	String name;// non static variable

	A(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		A a = new A("Payal");
		System.out.println(a.name + "-" + A.age);// to call static variable we need use .operator to call do not need
													// create object
		// by updating value age
		age = 23;
		System.out.println("After updating");
		System.out.println(a.name + "-" + A.age);

	}

}
