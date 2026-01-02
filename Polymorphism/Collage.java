package Polymorphism;

public class Collage extends Student {

	public String collage_name, collage_address;
	public int collage_pincode;

	public Collage(String student_name, String collage_name, String collage_address, int collage_pincode) {
		super(student_name);
		this.collage_name = collage_name;
		this.collage_address = collage_address;
		this.collage_pincode = collage_pincode;
	}

	public Collage(int student_id, long student_phone) { // Constructor overloading.
		super(student_id, student_phone);
	}

	@Override
	public void display() { // Overriding parent method into child class.
		super.display();
		System.out.println("Collage name:- " + collage_name);
		System.out.println("Collage address:- " + collage_address);
		System.out.println("Collage pincode:- " + collage_pincode);
	}

	public static void main(String[] args) {

		Collage collage = new Collage("Ashish", "M.J.Collage,Jalgaon", "Ganesh Colony", 1407);
		collage.student_id = 122;
		collage.student_phone = 9356935815l;
		collage.display();
	}
}