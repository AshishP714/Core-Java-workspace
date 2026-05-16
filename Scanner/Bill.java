package com.Scanner;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a price ");
		double a = sc.nextDouble();
		System.out.println("Enter quantity");
		int b = sc.nextInt();
		System.out.println("Bill  =" + a * b);
		sc.close();
	}
}
