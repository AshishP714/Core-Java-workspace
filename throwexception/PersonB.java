package com.throwexception;

public class PersonB {
	//in this class i have to handle exception
	public void handle() {
		PersonA a=new PersonA();
		try{
			a.divide(4, 0);
		}catch(Exception e) {
			System.out.println("/ by zero is not possible");
		}
	}

}
