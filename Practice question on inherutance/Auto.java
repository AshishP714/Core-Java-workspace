package com.practice5feb;

public class Auto extends Transport {
	private String autoNumber;

	public void setAutoNumber(String autoNumber) {
		this.autoNumber = autoNumber;
	}

	public String getAutoNumber() {
		return autoNumber;
	}

	public void displayAutoInfo() {
		System.out.println("Driver name =" + getDriverName());
		System.out.println("Vehicle number =" + getVehicleNumber());
		System.out.println("Auto number =" + getAutoNumber());
	}
}
