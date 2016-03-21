package L09_OOP_ext.homeWork9.t01_hierarchy;

public abstract class WildAnimal extends Animal {
	private boolean isPredator = true;

	public WildAnimal(int id, int age, float weight, String color) {
		super(id, age, weight, color);
	}

	public boolean isPredator() {
		return isPredator;
	}

	@Override
	public String voice() {
		return super.voice() + " I am a wild animal" + (isPredator() ? " and I am angry" : " :)");
	}
}
