package com.arraypractice;
//Write a program to declare and initialize a 1D array of integers.
public class Declareinitialize {
public static void main(String[] args) {
	int[] arr=new int[4];//dynamic way
	arr[0]= 5;
	arr[1]= 10;
	arr[2]= 15;
	arr[3]= 20;
	System.out.println(arr[1]);
	//static way
	int[] arr1= {67,89,896};
	System.out.println(arr1[2]);
	
}
}
