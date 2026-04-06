package com.practice5feb;

public class Train extends RailwaySystem {
	String stationName;
	String trainNumber;

	public void departing() {
		System.out.println("train would be departing in between 9am to 10am");
	}

	public void arriving() {
		System.out.println("train would be arriving at 6pm");
	}

}
