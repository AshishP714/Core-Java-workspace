package practice_2;

import java.util.Scanner;

public class PaymentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment payment = null;

        System.out.println("Choose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                payment = new UPI();
                break;
            case 2:
                payment = new CreditCard();
                break;
            case 3:
                payment = new DebitCard();
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        payment.pay(amount);  // Runtime Polymorphism 🔥

        sc.close();
    }
}