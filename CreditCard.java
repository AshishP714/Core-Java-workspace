package practice_2;

class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
        System.out.println("Credit Card Payment Successful ");
    }
}