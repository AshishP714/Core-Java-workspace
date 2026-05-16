package com.Scanner;

import java.util.Scanner;

public class SecondMinute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter second");
		int a = sc.nextInt();
		int min = a / 60;
		int sec = a % 60;
		System.out.println("Minutes =" + min);
		System.out.println("Second =" + sec);
		sc.close();
	}
}
