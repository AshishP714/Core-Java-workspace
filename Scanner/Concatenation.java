package com.Scanner;

import java.util.Scanner;

//Take two strings using nextLine() and print their concatenation.
public class Concatenation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String a = sc.nextLine();
		System.out.println("Enter second String");
		String b = sc.nextLine();
		System.out.println("Concatention =" + (a + b));
		sc.close();

	}

}
