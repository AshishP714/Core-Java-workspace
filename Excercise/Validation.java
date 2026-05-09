package com.Excercise;

public class Validation {
	public int a;
	public String validation(int a) {

		if (a >= 35 && a <= 65) {
			if (a % 2 == 0) {
				return "Valid";
			} else {
				return "Invalid...";
			}
		} else {
			return "Invalid...";
		}
	}
	public String name(String a) {
		System.out.println("name returned from the method: " + a);

		return a;
	}
	public void meddleName() {
		System.out.println("meddle name returned from the method");
	}

	public String surname(String a) {
		System.out.println("Surname returned from the surname method: " + a);
		return a;
	}
	public static void main(String[] args) {
		Validation even = new Validation();
		even.validation(43);
		String name = even.name("Ashish");
		String surname = even.surname("Pardeshi");

		System.out.println("name returned from the Main method: " + name);
		System.out.println("Surname returned from the Main method: " + surname);
		System.out.println("Result " + even.validation(43));
	}
}
