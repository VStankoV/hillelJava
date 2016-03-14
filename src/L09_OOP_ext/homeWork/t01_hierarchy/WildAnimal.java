package L09_OOP_ext.homeWork.t01_hierarchy;

public class WildAnimal extends Animal {
	private boolean isPredator = true;

	public boolean isPredator() {
		return isPredator;
	}

	protected WildAnimal(int id, int age, float weight, String color) {
		super(id, age, weight, color);
	}

	@Override
	public String voice() {
		return super.voice() + " I am a wild animal" + (isPredator() ? " and I am angry" : " :)");
	}
}
