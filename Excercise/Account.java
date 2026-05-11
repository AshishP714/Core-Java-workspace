package com.Excercise;

public class Account {

	public String name;
	public int phone;
	public int age;
	private int pin;
	private double salary;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public int getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public int getPin() {
		return pin;
	}
}
