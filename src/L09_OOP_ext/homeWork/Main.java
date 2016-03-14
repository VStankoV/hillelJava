package L09_OOP_ext.homeWork;


import L09_OOP_ext.homeWork.t01_hierarchy.Animal;
import L09_OOP_ext.homeWork.t01_hierarchy.Pet;
import L09_OOP_ext.homeWork.t01_hierarchy.pets.*;
import L09_OOP_ext.homeWork.t01_hierarchy.wildAnimals.*;

public class Main {

	public static void main(String[] args) {

		Animal fish = new Fish("Doroti",0,1,0.02f,"blue",false);
		System.out.println(fish.voice());

		Animal w = new Wolf(1, 5, 30.5f, "grey");
		System.out.println(w.voice());

		Animal lion = new Lion(2,3,45.8f,"camel");
		System.out.println(lion.voice());

		Animal giraffe = new Giraffe(3,4,80.5f,"spotted");
		System.out.println(giraffe.voice());

		Animal croc = new Crocodile(4,7,46.3f,"green");
		System.out.println(croc.voice());

		Animal hamster = new Hamster("Blitz", 5,1,0.35f,"yellow",true);
		System.out.println(hamster.voice());

		Animal cat = new Cat("Murka",6,2,5.2f,"black",false);
		System.out.println(cat.voice());

		Animal dog = new Dog("Bobik",7,3,10f,"white",true);
		System.out.println(dog.voice());

		Animal guideDog = new GuideDog("Lucky",8,3,8.5f,"beige",true,true,null);
		System.out.println(guideDog.voice());
		((GuideDog)guideDog).takeMeHome();

	}
}
