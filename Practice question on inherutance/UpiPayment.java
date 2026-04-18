package com.practice5feb;

public class UpiPayment extends Payment {
	String bankName;
	int id;

	public UpiPayment(double amount, String paymentdate, int id, String bankName) {
		this.amount = amount;
		this.bankName = bankName;
		this.id = id;
		this.paymentDate = paymentdate;
	}

	public void getValue() {
		System.out.println("Amount =" + amount);
		System.out.println("Bank Name =" + bankName);
		System.out.println("UPI Id =" + id);
		System.out.println("Payment Date =" + paymentDate);

	}
}
