package com.abstraction;

public class Google implements Meta {

	@Override
	public void logIn(String userName, String password) {
		if (userName.equals("ashish@2003") && password.equals("ashish456")) {
			System.out.println("Google Login SuccessFully... !");
		} else {
			System.out.println("Invalid username and password");
		}
	}

	@Override
	public void logOut() {
		System.out.println("Google Logout ...!");
	}

	public void search() {
		System.out.println("Searching...!");
	}

}
