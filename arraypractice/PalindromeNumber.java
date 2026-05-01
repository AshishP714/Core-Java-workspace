package com.arraypractice;

//Write a program to check whether a 1D array is a palindrome.
public class PalindromeNumber {
	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 2, 1 };
		int start = 0;
		int end = arr1.length - 1;
		boolean flag = true;
		while (start < end) {
			if (arr1[start] != arr1[end]) {
				flag = false;
			}
			start++;
			end--;

		}
		if (flag) {
			System.out.println("Palindrome");

		} else {
			System.out.println("not palindrome");
		}
	}
}
