package com.withreturntype;
 
public class Factorial {
	
	public int printFactorialNumber() {
		int num = 6;
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}
}
