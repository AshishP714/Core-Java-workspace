package com.Excercise;

public class LeepYear {
	public int number;
	
	public void LeepYear(int number) {
		
		if (number % 4 == 0) {
			System.out.println("It is a leep year:-");
		}
		else {
			System.out.println("It is not Leep Year");
		}
	}
	public static void main(String[] args) {
		
		LeepYear leepYear = new LeepYear();
		
		leepYear.LeepYear(2000);
	}
}
