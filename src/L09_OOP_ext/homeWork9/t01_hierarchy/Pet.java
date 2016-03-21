package L09_OOP_ext.homeWork9.t01_hierarchy;

public abstract class Pet extends Animal{

	private boolean isVaccinated;
	private String name;

	protected Pet(String name, int id, int age, float weight, String color, boolean isVaccinated) {
		super(id, age, weight, color);
		this.name = name;
		this.isVaccinated = isVaccinated;
	}


	@Override
	public String voice(){
		return super.voice() + " My name is " + getName();
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public void vaccinate () {
		isVaccinated = true;
	}

	public String getName() {
		return name;
	}

	public void reName (String name) {
		this.name = name;
	}
}
