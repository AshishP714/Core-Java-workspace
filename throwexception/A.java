package com.throwexception;

public class A {

	public void find() throws ClassNotFoundException {
		Class.forName("java.lang.string");
	}

}
