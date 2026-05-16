package com.Scanner;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal");
		int p = sc.nextInt();
		System.out.println("Enter rate");
		int r = sc.nextInt();
		System.out.println("Enter time");
		int t = sc.nextInt();
		System.out.println("Simple Interest =" + (p * r * t / 100));
		sc.close();
	}
}
