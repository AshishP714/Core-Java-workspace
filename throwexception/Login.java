package com.throwexception;

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
