package com.statickeyword;

//Create a class Building:
//Static block → print “Building class loaded”
//Non-static block → print “Preparing apartment”
//Constructor → print “Owner moved in”
//In main():
//Create 2 objects
//Observe the order of execution
public class Building {
	// static block
	static {
		System.out.println("Building class loaded");// without object cretion it call and this will execute first by
													// default before constructor and before object creation,once

	}
// non static  block
	{
		System.out.println("Preparing apartment");// 2 one this will execute when you create object
	}

//constructor
	Building() {
		System.out.println("Owner moved in");// this one after non static block
	}

	public static void main(String[] args) {
		new Building();
		new Building();
	}

}
