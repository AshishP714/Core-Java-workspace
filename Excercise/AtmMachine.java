package com.Excercise;

import java.util.*;

public class AtmMachine {
	int num;
	double balance = 0, deposit, withdrow;

	Scanner sc = new Scanner(System.in);

	public void pin() {
		int pin;
		System.out.println("Enter your pin ->");
		pin = sc.nextInt();
		while (pin == 1234) {
			System.out.println("--------Wellcome--------");
			Choice();
		}
		System.out.println("Incorrect pin...\nEnter valid pin\n");
		pin();
	}

	public void Choice() {

		do {
			System.out.println("1 -> Check Balance");
			System.out.println("2 -> Withdrawl");
			System.out.println("3 -> Deposit");
			System.out.println("4 -> Exit");
			System.out.print("Enter your Choice :- ");

			num = sc.nextInt();
			if (num == 1) {
				chakeBalance();

			} else if (num == 2) {
				withdrow();

			} else if (num == 3) {
				Deposit();

			}
		} while (num != 4);
	}

	public void Deposit() {
		System.out.print("Enter Amount:- ");
		deposit = sc.nextDouble();
		balance = balance + deposit;
		System.out.println("₹" + deposit + " deposited Successfully" + "\n");
	}

	public void withdrow() {

		System.out.print("Enter withdrow amount:- ");
		withdrow = sc.nextDouble();
		if (balance >= withdrow) {
			balance = balance - withdrow;
			System.out.println("₹" + withdrow + " withdrow successfully...." + "\n");
		} else {
			System.out.println("Warning....\nInvalid input please chake your account balance" + "\n");
		}

	}

	public void chakeBalance() {

		System.out.println("Avaliable Balance:- " + balance + "\n");
	}

	public static void main(String[] args) {

		AtmMachine atm = new AtmMachine();

		atm.pin();

	}
}
