package com.string;

public class ByLiterls {
	
	public static void main(String[] args) {
		String str1 = "ashish";
		String str2 = "ashish";
		String str3 = str1;
		
		System.out.println("using == opertor");
		System.out.println(str1 == str2);
		System.out.println(str3 == str1);
		System.out.println("Using equal method");
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		System.out.println("using hashcode method");
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		System.out.println("Using identifyHashCode method");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
