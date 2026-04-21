package com.singleinheritance;

public class SavingAccount extends Bank {
	public void withdraw() {
		System.out.println("taking money out from balance");
	}

	public void deposit() {
		System.out.println("deposit money into account");
	}

	public void checkBalance() {
		System.out.println("Checking balance");
	}
}
