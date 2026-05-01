package com.arraypractice;

//Write a program to find the average of elements in a 1D array.
public class average {
	public static void main(String[] args) {
		int[] arr = { 23, 34, 56, 76 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		int average = sum / arr.length;
		System.out.println("Average of elements =" + average);
	}
}
