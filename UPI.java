package practice_2;

public class UPI implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing UPI payment of ₹" + amount);
        System.out.println("UPI Payment Successful");
	}
}