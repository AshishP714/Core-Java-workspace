package com.practice5feb;

//7️⃣ Hotel Booking System
//Create a Single Inheritance program where 
//Hotel is the parent class and LuxuryHotel is the child class.
//using encapsulation and also take input from users
public class Hotel {
//make private variable
	private String hotelName;
	private String hotelLocation;

	// public variable
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

}
