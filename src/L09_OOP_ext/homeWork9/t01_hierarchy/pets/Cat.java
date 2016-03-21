package L09_OOP_ext.homeWork9.t01_hierarchy.pets;

import L09_OOP_ext.homeWork9.t01_hierarchy.Pet;

public class Cat extends Pet {
	public Cat(String name, int id, int age, float weight, String color, boolean isVaccinated) {
		super(name, id, age, weight, color, isVaccinated);
	}

	@Override
	public String voice() {
		return "Meow! " + super.voice();
	}


}
