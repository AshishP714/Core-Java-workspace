package com.throwexception;
//String Character Program
//Create a program where a method returns a character from a String using charAt().
//Declare throws StringIndexOutOfBoundsException and handle the exception in main()
public class Characters {
public char print(String s)throws StringIndexOutOfBoundsException {
	char ch=s.charAt(3);
	return ch;
	
}
}
