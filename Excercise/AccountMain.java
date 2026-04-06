package com.parameterizedconstructor;

public class AccountMain {

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account(36000);
		System.out.println(a2);
	}
}
