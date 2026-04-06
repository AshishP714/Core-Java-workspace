package com.practice5feb;
//create a single inheritance program where telecomService is the parent class and jio is child class
public class TelecomServiceMain {

	public static void main(String[] args) {
		//TelecomService --->jio = Single inheritance
		Jio j1 = new Jio();
		j1.provide();
		j1.call();
		j1.messaage();
		j1.internet();

	}

}
