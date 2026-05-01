package com.arraypractice;

//Write a program to find the maximum element in a 1D array.
public class Maximum {
	public static void main(String[] args) {
		int[] arr = { 23, 45, 67, 98 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max=arr[i];
			}

		}
		System.out.println("maximum elements in 1D array is =" + max);
	}
}
