package com.Scanner;

import java.util.Scanner;

//Take three sides of triangle and print its perimeter.
public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first side");
		double a=sc.nextDouble();
		System.out.println("Enter Second side");
		double b=sc.nextDouble();
		System.out.println("Enter third side");
		double c=sc.nextDouble();
		System.out.println("Perimeter ="+(a+b+c));
		sc.close();
	}

}
