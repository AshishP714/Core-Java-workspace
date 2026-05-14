package com.Scanner;

import java.util.Scanner;

// Take a number and check if it is even or odd.
public class EvenOddCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is even or odd");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		} else {
			System.out.println(a + " is odd number");
		}
		sc.close();
	}

}
