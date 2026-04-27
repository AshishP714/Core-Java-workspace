package com.typecasting;

//✅ Question 2: Data Loss Example
//Write a program:
//Store int num = 150
//Cast it into byte
//Print both values
//👉 Explain in comment why output changed.
public class PrimitiveTypeCasting2 {

	public static void main(String[] args) {
		int num = 150;
		System.out.println("previous value " + num);
		byte num2 = (byte) num;
		System.out.println("After convesation " + num2);
		// here we are storing int value in byte which comes in explicit
		// casting where we can face data loss if we store bigger data into smaller data
		// ofcourse data can be loss
	}

}
