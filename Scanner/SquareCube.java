package com.Scanner;

import java.util.Scanner;

// Take a number and print its square and cube.
public class SquareCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int a = sc.nextInt();
		System.out.println("Square =" + a * a);
		System.out.println("Cube  =" + a * a * a);
		sc.close();

	}

}
