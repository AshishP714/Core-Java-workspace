package com.throwexception;

public class B {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.find();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}
	}
}
