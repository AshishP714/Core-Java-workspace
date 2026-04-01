package com.abstraction;

public class WhatsAap implements Meta {

	@Override
	public void logIn(String userName, String password) {
		if (userName.equals("ashish@2003") && password.equals("ashishl456")) {
			System.out.println("Google Login SuccessFully... !");
		} else {
			System.out.println("Invalid username and password");
		}
	}

	@Override
	public void logOut() {
		System.out.println("Google Logout ...!");

	}

	public void sendPhoto() {
		System.out.println("Uploading photos on whatsaap");
	}

}
