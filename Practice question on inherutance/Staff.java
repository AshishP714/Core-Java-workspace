package com.practice5feb;

public class Staff extends University {
	int totalStaff;

	Staff(String uniName, String location, int totalStaff) {
		this.uniName = uniName;
		this.location = location;
		this.totalStaff = totalStaff;
	}

	public void staffInfo() {
		System.out.println("University name =" + uniName);
		System.out.println("University location =" + location);
		System.out.println("Total staff in university =" + totalStaff);
	}
}
