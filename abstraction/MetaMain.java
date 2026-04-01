package com.abstraction;

public class MetaMain {

	public static void main(String[] args) {
		Meta m = new Google();
		m.logIn("payal@2021", "payal456");
		m.logOut();
		// m.search(); not possible throught refrence creation to call specfic method of
		// object
		// they are two ways to get acquired object method
		// first throught object creation and typeCasting (DownCasting)
		Google g = new Google();
		g.search();
		// downCasting
		Google g1 = (Google) m;
		g1.search();
		System.out.println("----------------------");
		m = new WhatsAap();
		m.logIn("payal@2021", "payal456");
		m.logOut();
		// m.search(); not possible throught refrence creation to call specfic method of
		// object
		// they are two ways to get acquired object method
		// first throught object creation and typeCasting (DownCasting)
		WhatsAap w = new WhatsAap();
		w.sendPhoto();
		// downCasting
		WhatsAap w1 = (WhatsAap) m;
		w1.sendPhoto();
	}

}
