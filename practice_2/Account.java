package practice_2;

class Account {

	private double balance;

	private String accountHolder;

	public Account(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid deposit amount!");
			return;
		}
		balance += amount;
		System.out.println("Deposited: " + amount + " | Balance: " + balance);
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount!");
			return;
		}
		if (amount > balance) {
			System.out.println("Insufficient balance!");
			return;
		}
		balance -= amount;
		System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
	}

	public double calculateInterest() {
		return 0;
	}
}