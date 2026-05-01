package com.arraypractice;

//Write a program to copy elements from one array to another.
public class CopyElements {
	public static void main(String[] args) {
		int[] arr1 = { 12, 56, 34, 45 };
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			// System.out.println(arr2[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);

		}

	}
}
