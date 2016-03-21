package L09_OOP_ext.homeWork9.t01_hierarchy.pets;

import java.util.Scanner;

public class GuideDog extends Dog {

	private String homeAddress;

	private boolean isTrained;

	public GuideDog(String name, int id, int age, float weight, String color, boolean isTrained, boolean isVaccinated, String homeAddress) {
		super(name, id, age, weight, color, isVaccinated);
		this.isTrained = isTrained;
		this.homeAddress = homeAddress;
	}

	public boolean isTrained() {
		return isTrained;
	}

	public void train() {
		isTrained = true;
	}

	@Override
	public String voice() {
		return super.voice() + (isTrained() ? ". I can take you home." : "");
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void takeMeHome() {
		if (!(homeAddress == null)) {
			System.out.println("OK!, Let`s go to " + getHomeAddress());
		} else {
			System.out.println("I don`t know where are you live! Can yo tell me your address?\n");
			setHomeAddress((new Scanner(System.in)).next());
			takeMeHome();
		}

	}

}
