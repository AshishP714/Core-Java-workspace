package com.string;

public class Mix {
	
	public static void main(String[] args) {
		String s1 = new String("Ashish");
		String s2 = "Ashish";
		String s3 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s1);
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s2));
		
		String str1 = "Ashish";
		String str2 = str1.concat(" Pardeshi");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
	}
}
