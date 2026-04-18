package com.practice5feb;
//8️⃣ Transport System

//Design a Hierarchical Inheritance structure for
//Transport → Bus, Metro, Auto. using encapsulation

public class Transport {
	private String driverName;
	private String vehicleNumber;

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}
}
