package L18_decorator;

public class Robusta implements Beverage {
	@Override
	public int cost() {
		return 15;
	}

	@Override
	public String description() {
		return "Robusta";
	}
}
