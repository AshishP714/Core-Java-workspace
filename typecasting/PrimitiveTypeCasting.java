package com.typecasting;

//✅ Question 1: Implicit + Explicit Together
//Write a Java program that:
//Takes int a = 25
//Converts it to double
//Then converts it back to int
//Print all three values
public class PrimitiveTypeCasting {
	public static void main(String args[]) {
		int a = 25;
		System.out.println("intial a value is =" + a);
		double b = a;
		System.out.println("after converting into double a become " + b);
		int c = (int) a;
		System.out.println("again after coverting back into int " + c);
	}
}
