package com.Scanner;

import java.util.Scanner;

// Take two numbers and print multiplication & division.
public class MultiplyDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number number");
		int a = sc.nextInt();
		System.out.println("enter second number number");
		int b = sc.nextInt();
		int multiply = a * b;
		double division = a / b;
		System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
		System.out.println("Division of " + a + " and " + b + " is " + (a / b));
		sc.close();
	}

}
