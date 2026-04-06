package RevisionCodes;

public abstract class Vehical {

	public int speed;

	public Vehical(int speed) {
		this.speed = speed;
	}

	abstract void run();

	public void speedDisplay() {

		System.out.println("Speed is :- " + speed);
	}
}
