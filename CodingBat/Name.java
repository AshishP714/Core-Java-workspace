/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
*/
package CodingBat;

public class Name {

	public String helloName(String name) {

		return "Hello " + name + "!";
	}

	public static void main(String[] args) {

		Name name = new Name();
		System.out.println(name.helloName("Bob"));
		System.out.println(name.helloName("Alice"));
		System.out.println(name.helloName("X"));
	}
}
