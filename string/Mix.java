package com.string;

public class Mix {
	public static void main(String[] args) {
		String s1 = new String("Payal");
		String s2 = "Payal";
		String s3 = s1;
		// checking content first
		System.out.println(s1.equals(s2));// true
		System.out.println(s2.equals(s3));// true
		// checking reference
		System.out.println(s1 == s2);// false
		System.out.println(s3 == s1);// true
		System.out.println(s1.hashCode());// same
		System.out.println(s3.hashCode());
		System.out.println(System.identityHashCode(s1));// same
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s2));// different
		// immutable (Can not changed)
		String str1 = "Payal";
		String str2 = str1.concat(" Chavan");
		System.out.println(str1);
		System.out.println(str2);// it store in different object in heap
		System.out.println(str1 == str2);// false pointing differnt object

	}
}
