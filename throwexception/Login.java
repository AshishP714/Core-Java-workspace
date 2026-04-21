package com.throwexception;

//Login Validation
//Create a method that checks username.
//If username is empty ("") → throw Exception.
//Declare throws Exception.
//Handle exception in main() using try-catch.
public class Login {
	String userName;

	Login(String userName) {
		this.userName = userName;
	}

	public void check() throws Exception {
		if (userName.isEmpty() == true) {
			throw new Exception("User name can not be empty");
		}
		System.out.println("String length =" + userName.length());
	}

	public static void main(String[] args) {
		Login l = new Login("");
		try {
			l.check();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
