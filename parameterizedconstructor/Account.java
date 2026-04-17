package com.parameterizedconstructor;
//Create a class Account with:

//Default constructor → set balance = 1000
//Parameterized constructor → set balance based on user input
//Display both account balances.**

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
