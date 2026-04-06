
public class AnimalMain {

	public static void main(String[] args) {
		System.out.println("First object creation");
		Animal dog = new Animal();
		dog.animalName = "Dog";
		dog.color = "Black";
		dog.ispetAnimal = true;
		dog.weight = 14;
		dog.height = 3.0;
		dog.barking();
		dog.loyal();
		dog.Sound();
		dog.eating();
		dog.display();
		System.out.println("--------");
		System.out.println("First object creation");
		Animal rabbit = new Animal();
		rabbit.animalName = "rabbit";
		rabbit.color = "White";
		rabbit.ispetAnimal = true;
		rabbit.weight = 12;
		rabbit.height = 1;
		rabbit.loyal();
		rabbit.Sound();
		rabbit.eating();
		rabbit.display();
		System.out.println("--------");
		Animal cat = new Animal();
		cat.animalName = "Cat";
		cat.color = "Brown";
		cat.ispetAnimal = true;
		cat.weight = 12;
		cat.loyal();
		cat.Sound();
		cat.eating();
		cat.display();
		System.out.println("-------");
		Animal hourse = new Animal();
		hourse.animalName = "Hourse";
		hourse.color = "Brown";
		hourse.ispetAnimal = true;
		hourse.weight = 78;
		hourse.height = 7;
		hourse.loyal();
		hourse.Sound();
		hourse.eating();
		hourse.display();
		System.out.println("------");

	}

}
