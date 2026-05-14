package com.Scanner;

import java.util.Scanner;

//Take three numbers and print the largest number.
public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println(a + " is largest number");
		} else if (b > c && b > a) {
			System.out.println(b + " is largest number");
		} else {
			System.out.println(c + " is largest number");
		}
		 sc.close();
	}

}
