package com.arraypractice;
//Write a program to find the length of a 1D array.

import java.util.Scanner;

public class Length {
	public static void main(String[] args) {
		// without using in-bulid method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value");
		int[] arr1 = new int[6];
		int length = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("After taking input from users");
		for (int i = 0; i < arr1.length; i++) {
			length++;

		}
		System.out.println("length of 1 d array is =" + length);
		// using method
		System.out.println("Length of array is =" + arr1.length);
		sc.close();

	}
}
