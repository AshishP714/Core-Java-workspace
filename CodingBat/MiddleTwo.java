/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". 
The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/
package CodingBat;

public class MiddleTwo {

	public String middleTwo(String str) {
		
		return str.charAt(str.length()/2-1)+""+str.charAt(str.length()/2);
	}
	
	public static void main(String[] args) {
		
		MiddleTwo middle = new MiddleTwo();
		System.out.println(middle.middleTwo("String"));
		System.out.println(middle.middleTwo("code"));
		System.out.println(middle.middleTwo("Practice"));

	}
}
