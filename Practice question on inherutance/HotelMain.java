package com.practice5feb;

import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LuxuryHotel l1 = new LuxuryHotel();
		System.out.println("Enter hotel name");
		l1.setHotelName(sc.nextLine());
		System.out.println("Enter hotel location");
		l1.setHotelLocation(sc.nextLine());
		System.out.println("enter rating for LuxuaryHotel");
		l1.setRate(sc.nextLine());
		System.out.println("Is spa is available");
		l1.setIsSpaAvailable(sc.nextBoolean());
		l1.display();
		sc.close();
	}

}
