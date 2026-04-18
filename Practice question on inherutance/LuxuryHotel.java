package com.practice5feb;

public class LuxuryHotel extends Hotel {
	private String rate;
	private boolean isSpaAvailable;

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRate() {
		return rate;
	}

	public void setIsSpaAvailable(boolean isSpaAvailable) {
		this.isSpaAvailable = isSpaAvailable;
	}

	public boolean getIsSpaAvailable() {
		return isSpaAvailable;
	}

	public void display() {
		System.out.println("Hotel name =" + getHotelName());
		System.out.println("Hotel location =" + getHotelLocation());
		System.out.println("Hotel rate =" + getRate());
		System.out.println("IsSpaAvailable =" + getIsSpaAvailable());
	}
}
