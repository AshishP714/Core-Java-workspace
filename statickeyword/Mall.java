package com.statickeyword;

public class Mall {
	static String mallName;
	String visitorName;
	static int totalVisistors = 0;
	{
		mallName = "Global mall";
	}
	Mall(String visitorName) {
		this.visitorName = visitorName;
		totalVisistors++;
	}
	public void display() {
		System.out.println("Mall name =" + mallName + "---" + "Visitor name =" + visitorName);
	}

	public static void main(String[] args) {
		Mall m = new Mall("Payal");
		m.display();
		Mall m1 = new Mall("riya");
		m1.display();
		System.out.println("Total visistor =" + totalVisistors);
	}
}
