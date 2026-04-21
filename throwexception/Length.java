package com.throwexception;

//String Length Check
//Create a method that returns the length of a String.
//Declare throws NullPointerException.
//Call it with null from main() and handle exception.
public class Length {
	String s = null;

	public int lengthCheck() throws NullPointerException {
		int length = s.length();
		return length;

	}

	public static void main(String[] args) {
		Length l = new Length();
		try {
			l.lengthCheck();
		} catch (Exception e) {
			System.out.println("can not get length of null string");
		}
	}
}
