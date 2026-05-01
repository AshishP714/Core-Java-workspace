package com.arraypractice;

//Write a program to find duplicate elements in a 1D array.
public class DuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 36, 89, 12, 26, 36, 89, 12 };
		// int isDuplicate=false;
		for (int i = 0; i < arr.length; i++) {

			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {

					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate == true) {
				System.out.println(arr[i]);
			}

		}

	}

}
