package practice_2;

class DebitCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Debit Card payment of ₹" + amount);
        System.out.println("Debit Card Payment Successful");
    }
}