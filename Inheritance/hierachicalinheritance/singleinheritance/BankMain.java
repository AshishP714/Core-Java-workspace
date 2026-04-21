package com.singleinheritance;

public class BankMain {

	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount();
		s1.create();
		s1.checkBalance();
		s1.deposit();
		s1.withdraw();

	}

}
