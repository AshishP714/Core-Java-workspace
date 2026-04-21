package com.throwexception;

public class CharMain {
public static void main(String[] args) {
	Characters ch=new Characters();
	try {
		ch.print("Hi");
		
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("String out of index");
		
	}
	
}
}
