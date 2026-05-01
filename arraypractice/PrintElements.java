package com.arraypractice;

import java.util.Scanner;

//Write a program to print all elements of a 1D array.
public class PrintElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value");
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("After taking input from users");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		sc.close();
	}

}
