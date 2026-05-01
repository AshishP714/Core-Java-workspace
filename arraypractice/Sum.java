package com.arraypractice;
//Write a program to find the sum of all elements in a 1D array.
public class Sum {
public static void main(String[] args) {
	int[] arr1= {5,2,2,4,7};
	int sum=0;
	for(int i=0;i<arr1.length;i++) {
		//System.out.println(arr1[i]);
		sum=sum+arr1[i];
	}
	System.out.println(sum);
}
}
