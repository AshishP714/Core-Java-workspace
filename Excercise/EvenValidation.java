package com.Excercise;

import org.json.JSONObject;

public class EvenValidation {

	public int a;

	public String validation(int a) {

		if (a >= 35 && a <= 65) {
			if (a % 2 == 0) {
				return "Valid because number is Even";
			} else {
				return "Invalid because number is Odd";
			}
		} else {
			return "Invalid the number is out of bound";
		}
	}
	
	public void testGettersSettersMethod(TestGetterSetters testGetterSetters) {
		TestGetterSetters testGetterSettersNew = new TestGetterSetters();
		testGetterSettersNew.setName("Tushar Pardeshi");
		String nameNew = testGetterSettersNew.getName();
		
		int rollNumber = testGetterSetters.getRollNumber();
		String name = testGetterSetters.getName();
		long contactNumber = testGetterSetters.getContactNumber();
		boolean isStudent = testGetterSetters.isStudent();
		
		JSONObject studentObject = new JSONObject();
		studentObject.put("Roll Number", rollNumber);
		studentObject.put("Student name", name);
		studentObject.put("Student Contact Number", contactNumber);
		studentObject.put("Is he Student", isStudent);
		
		System.out.println(studentObject);
	}

	public static void main(String[] args) {
		EvenValidation even = new EvenValidation();
		System.out.println("Result " + even.validation(46));		
	}
}
