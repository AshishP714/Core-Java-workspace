package com.statickeyword;

//Create a class MathUtils:
//Static method square(int x) → returns square of x
//Static method cube(int x) → returns cube of x
//Non-static method add(int a, int b) → returns sum
//In main():
//Call static methods without creating object
//Call non-static method using object
public class MathsUtils {
	static public int square(int x) {
		int square = x * x;
		return square;
	}

	static public int cube(int x) {
		int cube = x * x * x;
		return cube;
	}

	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Square =" + MathsUtils.square(8));
		System.out.println("Cube =" + MathsUtils.cube(8));
		MathsUtils m = new MathsUtils();
		int a = m.sum(3, 9);
		System.out.println("Sum =" + a);
	}
}
