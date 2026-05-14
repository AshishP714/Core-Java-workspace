package com.Scanner;

//Take marks of 5 subjects and print total & percentage.
import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter maths marks");
		int a = sc.nextInt();
		System.out.println("enter biology marks");
		int b = sc.nextInt();
		System.out.println("enter physics marks");
		int c = sc.nextInt();
		System.out.println("enter chemistry marks");
		int d = sc.nextInt();
		System.out.println("enter english marks");
		int e = sc.nextInt();

		int total = a + b + c + d + e;
		System.out.println("total =" + total);
		double percentage = (total / 500.0) * 100;
		System.out.println("Percentage =" + percentage);
          sc.close();
	}

}
