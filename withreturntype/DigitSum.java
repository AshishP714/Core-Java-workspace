package com.withreturntype;

//write a method a that return sum of digit of a number(number is fixed inside a method)
public class DigitSum {
//digit sum ex.1234=1+2+3+4=10 like this
	public int addDigit() {
		int num = 1234;
		int sum = 0;
		for (int i = num; i > 0; i--) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}
}
