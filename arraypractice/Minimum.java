package com.arraypractice;

//Write a program to find the minimum element in a 1D array.
public class Minimum {
	public static void main(String[] args) {
		int[] arr = { 23, 12, 67, 98 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("minimum elements in 1D array is =" + min);
	}
}
