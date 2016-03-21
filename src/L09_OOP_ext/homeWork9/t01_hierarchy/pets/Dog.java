package L09_OOP_ext.homeWork9.t01_hierarchy.pets;

import L09_OOP_ext.homeWork9.t01_hierarchy.Pet;

public class Dog extends Pet {
	public Dog(String name, int id, int age, float weight, String color, boolean isVaccinated) {
		super(name, id, age, weight, color, isVaccinated);
	}

	@Override
	public String voice() {
		return "Woof! " + super.voice();
	}

}
