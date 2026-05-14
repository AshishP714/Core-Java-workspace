package com.Scanner;

import java.util.Scanner;

//Take name and age from user and display them.
public class NameAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int a = sc.nextInt();
		System.out.println("my age is " + a);
		System.out.println("Enter your name ");
		String b = sc.next();
		System.out.println("my name is " + b);
		sc.close();
	}

}
