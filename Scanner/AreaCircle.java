package com.Scanner;

import java.util.Scanner;

//Take radius from user and calculate area of circle.
public class AreaCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int r = sc.nextInt();
		System.out.println("Area of circle =" + (3.14 * r * r));
		 sc.close();
	}

}
