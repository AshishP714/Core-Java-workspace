package com.practice5feb;

public class Bus extends Transport {
	private int numberOfStops;
	private String busType;

	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	public int getNumberOfStops() {
		return numberOfStops;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getBusType() {
		return busType;
	}

	public void displayBus() {
		System.out.println("Driver name =" + getDriverName());
		System.out.println("Vehicle number =" + getVehicleNumber());
		System.out.println("Number osf stops in bus = " + getNumberOfStops());
		System.out.println("Bus type =" + getBusType());
	}

}
