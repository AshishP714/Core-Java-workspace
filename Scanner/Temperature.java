package com.Scanner;

import java.util.Scanner;

//Take temperature in Celsius and convert to Fahrenheit.
public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a temperature in celsius");
		double a = sc.nextDouble();
		double fahrenheit = (9.0 / 5 )* a + 32;
		System.out.println("Fahrenheit=" + fahrenheit);
		sc.close();
	}

}
