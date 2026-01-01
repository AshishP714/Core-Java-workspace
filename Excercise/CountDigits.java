//Write a program to count the number of digit of a number. 
package com.Excercise;

public class CountDigits {

	int digit, count = 0;

	public void Count(int digit) {

		if (digit == 0) {
			count = count + 1;
		} else {
			while (digit != 0) {
				digit = digit / 10;
				count++;
			}
		}
		System.out.println("The number of Digit:- " + count);
	}

	public static void main(String[] args) {

		CountDigits countDigits = new CountDigits();

		countDigits.Count(144);
	}
}

