package com.abstraction;

public class MetaMain {

	public static void main(String[] args) {
		Meta m = new Google();
		m.logIn("payal@2021", "payal456");
		m.logOut();
		
		Google g = new Google();
		g.search();
		
		Google g1 = (Google) m;
		g1.search();
		System.out.println("----------------------");
		m = new WhatsAap();
		m.logIn("payal@2021", "payal456");
		m.logOut();
		
		WhatsAap w = new WhatsAap();
		w.sendPhoto();
		
		WhatsAap w1 = (WhatsAap) m;
		w1.sendPhoto();
	}
}
