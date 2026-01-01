/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
*/
package CodingBat;

public class Abba {

	public String MakeAbba(String a, String b) {
		
		return a+b+b+a;
	}
	
	public static void main(String[] args) {
		
		Abba abba = new Abba();
		System.out.println(abba.MakeAbba("Hi","Bye"));
		System.out.println(abba.MakeAbba("Yo","Alice"));
		System.out.println(abba.MakeAbba("What","Up"));
	}
}
