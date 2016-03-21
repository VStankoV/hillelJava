package L09_OOP_ext.homeWork9.t01_hierarchy.wildAnimals;

import L09_OOP_ext.homeWork9.t01_hierarchy.WildAnimal;

public class Giraffe extends WildAnimal {
	public Giraffe(int id, int age, float weight, String color) {
		super(id, age, weight, color);
	}

	@Override
	public boolean isPredator() {
		return false;
	}
}
