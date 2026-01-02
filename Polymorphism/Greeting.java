package Polymorphism;

public class Greeting {

	public void greet() {

		System.out.println("Hello");
	}

	public void greet(String name) {

		System.out.println("Hello " + name + "!");
	}

	public void greet(String name, int age) {

		System.out.println("Hello " + name + "!" + " you are " + age + " year old");
	}

	public static void main(String[] args) {

		Greeting greeting = new Greeting();
		greeting.greet();
		greeting.greet("Nikhil");
		greeting.greet("Ashish", 18);
	}
}
