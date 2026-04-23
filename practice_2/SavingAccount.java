package practice_2;

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Cannot withdraw! Minimum balance of 500 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }
}