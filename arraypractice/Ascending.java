package com.arraypractice;

import java.util.Arrays;

//Write a program to sort a 1D array in ascending order.
public class Ascending {
	public static void main(String[] args) {
		int[] arr = { 45, 27, 19, 100 };
		// int asc=arr[0];
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			
		}
		System.out.println(arr[i]);
//		
	}
	System.out.println("-----------");
//	using bulid-in method
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}
}
