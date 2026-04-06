package com.practice5feb;

public class RailwaySystemMain {

	public static void main(String[] args) {
		Passenger p1 = new Passenger();
		p1.login();
		int a = p1.age = 22;
		String b = p1.name = "Payal";
		System.out.println("Passenger age =" + a);
		System.out.println("Passenger name =" + b);
		p1.passengerInfo();
		System.out.println("-------------------------------------");
		Ticket t1 = new Ticket();
		t1.login();
		double c = t1.price = 1500;
		int d = t1.ticketNumber = 854;
		System.out.println("Ticket price =" + c);
		System.out.println("Ticket number=" + d);
		System.out.println("---------------------------------");
		Train tra = new Train();
		tra.login();
		String name = tra.stationName = "Pune";
		String number = tra.trainNumber = "KA 675";
		System.out.println("Station name =" + name);
		System.out.println("Train number =" + number);
		tra.arriving();
		tra.departing();

	}

}
