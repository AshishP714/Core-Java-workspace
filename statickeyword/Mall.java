package com.statickeyword;

//🔹 Question 1 – Visitor Counter 🏢
//Create a class Mall:
//mallName (same for all)
//visitorName (different for each)
//totalVisitors (should increase every time object is created)
public class Mall {
//practice on static variable
	static String mallName;// static variable
	String visitorName;// non static variable
	static int totalVisistors = 0;
	// non static blocks
	{
		mallName = "Global mall";
	}

	// constructor
	Mall(String visitorName) {
		this.visitorName = visitorName;
		totalVisistors++;
	}

	// method
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
