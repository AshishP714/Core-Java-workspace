package com.Scanner;

import java.util.Scanner;

public class CheckPassFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a marks");
		float a=sc.nextFloat();
		if(a>=35&&a<=100) {
			System.out.println("Pass");
		}else {
			System.out.println("fail");
		}
		sc.close();
	}
}
