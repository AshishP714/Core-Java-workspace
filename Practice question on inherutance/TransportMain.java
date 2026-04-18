package com.practice5feb;

import java.util.Scanner;

public class TransportMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// bus class object creation
		Bus b1 = new Bus();
		System.out.println("Enter driver name");
		b1.setDriverName(sc.nextLine());
		System.out.println("Enter vehicle number");
		b1.setVehicleNumber(sc.nextLine());
		System.out.println("Enter number of stops in bus");
		b1.setNumberOfStops(sc.nextInt());
		sc.nextLine();// clear the buffer
		System.out.println("Enter type of bus");
		b1.setBusType(sc.nextLine());
		b1.displayBus();
		// Metro class object creation
		Metro m1 = new Metro();
		System.out.println("Enter driver name");
		m1.setDriverName(sc.nextLine());
		System.out.println("Enter vehicle number");
		m1.setVehicleNumber(sc.nextLine());
		System.out.println("Enter line name");
		m1.setLineName(sc.nextLine());
		m1.displayMetro();
		// Auto class object creation
		Auto a1 = new Auto();
		System.out.println("Enter driver name");
		a1.setDriverName(sc.nextLine());
		System.out.println("Enter vehicle number");
		a1.setVehicleNumber(sc.nextLine());
		System.out.println("Enter Auto number");
		a1.setAutoNumber(sc.nextLine());
		a1.displayAutoInfo();

	}

}
