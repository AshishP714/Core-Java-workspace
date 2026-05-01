package com.arraypractice;
//Write a program to count even and odd numbers in a 1D array.
public class EvenOdd {
public static void main(String[] args) {
	int[] arr= {37,89,12,45,99,34};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println("Even number"+arr[i]);
		}else if(arr[i]%2!=0){
			System.out.println("Odd number ="+arr[i]);
		}
		
	}
		
	
}
}
