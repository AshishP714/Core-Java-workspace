package com.Excercise;

public class Bank {

	public static void main(String[] args) {

//		Account account = new Account();
//
//		account.setName("Ashish");
//		account.setPhone(452315469);
//		account.setAge(22);
//		account.setSalary(50000);
//		account.setPin(4327);
//		System.out.println(account.getName());
//		System.out.println(account.getPhone());
//		System.out.println(account.getAge());
//		System.out.println(account.getSalary());
//		System.out.println(account.getPin());
		
		
		// Test Getters and Setters
		
		TestGetterSetters testGetterSetters = new TestGetterSetters();
		
		testGetterSetters.setRollNumber(111);
		testGetterSetters.setContactNumber(1122334455);
		testGetterSetters.setName("Nikhil Pardeshi");
		testGetterSetters.setStudent(true);
		
		EvenValidation evenValidation = new EvenValidation();
		evenValidation.testGettersSettersMethod(testGetterSetters);
	}
}
