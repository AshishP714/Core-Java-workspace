package com.hierachicalinheritance;

public class GoogleMain {

	public static void main(String[] args) {
		// create object of child class
		Gmail g1 = new Gmail();
		g1.login();
		g1.write();
		g1.send();
		g1.logout();
		System.out.println("------------------------------");
		Gmap g2 = new Gmap();
		g2.login();
		g2.search();
		g2.route();
		g2.logout();
		System.out.println("------------------------------");
		Gdrive g3 = new Gdrive();
		g3.login();
		g3.download();
		g3.send();
		g3.logout();
		System.out.println("------------------------------");
	}

}
