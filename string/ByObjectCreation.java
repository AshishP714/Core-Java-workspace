package com.string;

public class ByObjectCreation {
	
	public static void main(String[] args) {
		
		String s1=new String("Ashish");
		String s2=new String("Ashish");
		String s3=new String("Shubham");
		System.out.println("by checking equal() method....!");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println("by checking == opertor.....!");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		String s4=s3;
		System.out.println(s3==s4);
		System.out.println("by checking hashcode method");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("By checking identifyhashcode method");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));	
	}
}
