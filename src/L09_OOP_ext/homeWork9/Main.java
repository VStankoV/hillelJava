package L09_OOP_ext.homeWork9;


import L09_OOP_ext.homeWork9.t01_hierarchy.Animal;
import L09_OOP_ext.homeWork9.t01_hierarchy.pets.*;
import L09_OOP_ext.homeWork9.t01_hierarchy.wildAnimals.Crocodile;
import L09_OOP_ext.homeWork9.t01_hierarchy.wildAnimals.Giraffe;
import L09_OOP_ext.homeWork9.t01_hierarchy.wildAnimals.Lion;
import L09_OOP_ext.homeWork9.t01_hierarchy.wildAnimals.Wolf;

public class Main {

	public static void main(String[] args) {
		ImprovedArray array = new ImprovedArray();

		for (int i = 0; i <= 15; i++) {
			array.add(i);
			if (i == 5 || i == 8) {
				array.add("injection");
			}
			array.add(i);
		}

		System.out.println(array.toStringFull());
		System.out.println(array.toString());

		System.out.println(array.getElementAt(0));
		System.out.println(array.getElementAt(19));
//		System.out.println(array.getElementAt(20));		//produce exeption
		System.out.println("size: " + array.size());

		System.out.println(array.contains(5));
		array.add(new String("hi"));
		System.out.println(array.contains(new String("hi")));

		array.remove(new Integer(10));
		System.out.println(array.toString());

		array.remove(6);
		array.remove(6);
		System.out.println(array.toString());

		array.remove("injection");
		System.out.println(array.toString());


	}


	public static void main2(String[] args) {

		Animal fish = new Fish("Doroti", 0, 1, 0.02f, "blue", false);
		System.out.println(fish.voice());

		Animal w = new Wolf(1, 5, 30.5f, "grey");
		System.out.println(w.voice());

		Animal lion = new Lion(2, 3, 45.8f, "camel");
		System.out.println(lion.voice());

		Animal giraffe = new Giraffe(3, 4, 80.5f, "spotted");
		System.out.println(giraffe.voice());

		Animal croc = new Crocodile(4, 7, 46.3f, "green");
		System.out.println(croc.voice());

		Animal hamster = new Hamster("Blitz", 5, 1, 0.35f, "yellow", true);
		System.out.println(hamster.voice());

		Animal cat = new Cat("Murka", 6, 2, 5.2f, "black", false);
		System.out.println(cat.voice());

		Animal dog = new Dog("Bobik", 7, 3, 10f, "white", true);
		System.out.println(dog.voice());

		Animal guideDog = new GuideDog("Lucky", 8, 3, 8.5f, "beige", true, true, null);
		System.out.println(guideDog.voice());
		((GuideDog) guideDog).takeMeHome();

	}
}
