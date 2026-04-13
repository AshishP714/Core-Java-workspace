package com.string;

public class ByLiterls {
	public static void main(String[] args) {
		String str1 = "payal";
		String str2 = "Payal";
		String str3 = str1;
		// check refence(is they pointing same object or not)
		System.out.println("using == opertor");
		System.out.println(str1 == str2);// false
		System.out.println(str3 == str1);// true
		System.out.println("Using equal method");
		// checks contain
		System.out.println(str1.equals(str3));// true
		System.out.println(str1.equals(str2));// false
		System.out.println("using hashcode method");
		System.out.println(str1.hashCode());// same value in both
		System.out.println(str3.hashCode());
		System.out.println("Using identifyHashCode method");
		System.out.println(System.identityHashCode(str1));// same for str1 and str3 because both pointing same object
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
