package com.throwexception;

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
