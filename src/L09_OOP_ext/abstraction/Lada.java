package L09_OOP_ext.abstraction;

public class Lada extends Auto implements Repairable {
	@Override
	public void repair() {
		System.out.println("repaired");
	}
}
