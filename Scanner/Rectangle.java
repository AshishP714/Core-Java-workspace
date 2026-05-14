package com.Scanner;

import java.util.Scanner;

//Take length and width and calculate area of rectangle.
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		double a = sc.nextDouble();
		System.out.println("Enter width");
		double b = sc.nextDouble();
		System.out.println("Area of rectangle =" + a * b);
		sc.close();
	}
        
} 
