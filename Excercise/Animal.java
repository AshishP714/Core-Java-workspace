
public class Animal {
	String animalName;
	String color;
	int weight;
	double height;
	boolean ispetAnimal;

	void eating() {
		System.out.println("Dog is eating his food");
	}

	void barking() {
		System.out.println("dog is barking outside");
	}

	void loyal() {
		System.out.println("Animal are know for their loyality towards their owner");
	}

	void Sound() {
		System.out.println("Animal make Sound");
	}

	void display() {
		System.out.println("Animal name =" + animalName);
		System.out.println("Color =" + color);
		System.out.println("Weight =" + weight);
		System.out.println("Height =" + height + "feet");
		System.out.println(" Is a pet animal =" + ispetAnimal);
	}

}
