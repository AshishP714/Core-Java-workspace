package RevisionCodes;

public class Car extends Vehical {

	public Car(int speed) {
		super(speed);
	}

	@Override
	void run() {
		System.out.println("Car is running.....");
	}
}