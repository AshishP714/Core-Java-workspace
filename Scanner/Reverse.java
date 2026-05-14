package com.Scanner;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for reverse");
		int n = sc.nextInt();
		int n1 = n;
		int rev = 0;
		while (n > 0) {
			int digit = n % 10;// last digit
			rev = rev * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reverse of " + n1 + " is " + rev);
		sc.close();
	}

}
