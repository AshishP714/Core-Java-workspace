package com.statickeyword;

public class Outer {
	int outerVariable = 67;

	class Inner {
		public void method() {
			System.out.println("outer variable =" + outerVariable);
		}
	}

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner inn = out.new Inner();
		inn.method();

	}

}
