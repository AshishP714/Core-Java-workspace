package com.Excercise;

public class Bank {

	public static void main(String[] args) {
		
		TestGetterSetters testGetterSetters = new TestGetterSetters();
		
		testGetterSetters.setRollNumber(111);
		testGetterSetters.setContactNumber(1122334455);
		testGetterSetters.setName("Nikhil Pardeshi");
		testGetterSetters.setStudent(true);
		
		EvenValidation evenValidation = new EvenValidation();
		evenValidation.testGettersSettersMethod(testGetterSetters);
	}
}
