package com.Excercise;

import java.util.Scanner;

public class CountDigit2 {
	int digit, count = 0;
	Scanner scanner = new Scanner(System.in);
	
	public void value () {
		System.out.println("Enter the number:- ");
		digit = scanner.nextInt();

		if (digit == 0) {
			count = count + 1;
		} else {
			while (digit != 0) {
				digit = digit / 10;
				count++;
			}
		}
		System.out.println("Number of digit is:- " + count);
	}
	public static void main(String[] args) {
		
		CountDigit2 cd = new CountDigit2();
		
		cd.value();
	}	
}
