package com.statickeyword;

public class Outer2 {
	static int var = 98;

	static class Inner {
		public void m1() {
			System.out.println("Outer class variable =" + var);
		}
	}

	public static void main(String[] args) {
		Outer2.Inner inn = new Outer2.Inner();
		inn.m1();
	}
}
