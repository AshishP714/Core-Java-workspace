package com.parameterizedconstructor;

public class Account {
	int balance;

	Account() {
		this.balance = 1000;
		System.out.println("Balance1 =" + balance);
	}

	Account(int balance) {
		this.balance = balance;
	}

	public String toString() {
		return " Balance2 = " + balance;
	}
}
