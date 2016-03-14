package L09_OOP_ext.homeWork.t01_hierarchy;

public abstract class Animal {
	protected int id;
	protected int age;
	protected float weight;
	protected String color;

	public Animal(int id, int age, float weight, String color) {
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}

	public String voice() {
		return "Hello!";
	}

}
