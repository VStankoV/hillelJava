package L09_OOP_ext.homeWork.t01_hierarchy.wildAnimals;

import L09_OOP_ext.homeWork.t01_hierarchy.WildAnimal;

public class Giraffe extends WildAnimal {
	@Override
	public boolean isPredator() {
		return false;
	}

	public Giraffe(int id, int age, float weight, String color) {
		super(id, age, weight, color);
	}
}
