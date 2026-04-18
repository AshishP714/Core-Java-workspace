package com.practice5feb;

public class Metro extends Transport {
	private String lineName;

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getLineName() {
		return lineName;
	}

	public void displayMetro() {
		System.out.println("Driver name =" + getDriverName());
		System.out.println("Vehicle number =" + getVehicleNumber());
		System.out.println("Line name =" + getLineName());

	}
}
