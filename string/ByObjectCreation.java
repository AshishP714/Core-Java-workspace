package com.string;

public class ByObjectCreation {
	public static void main(String[] args) {
		//String with new 
		String s1=new String("Ashish");
		String s2=new String("Ashish");
		String s3=new String("Shubham");
		System.out.println("by checking equal() method....!");
		//first we will check if they have content or not
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));//false
		System.out.println("by checking == opertor.....!");
		
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		String s4=s3;
		System.out.println(s3==s4);//pointing in same object true
		System.out.println("by checking hashcode method");
		//hashcode is method which return int value if both object contain same then hashcode will be same for both refrence 
		System.out.println(s1.hashCode());//same
		System.out.println(s2.hashCode());//same
		
		System.out.println(s3.hashCode());//same
		System.out.println(s4.hashCode());//same
		System.out.println("By checking identifyhashcode method");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));//same
		System.out.println(System.identityHashCode(s4));//same
		
		
	}


}
