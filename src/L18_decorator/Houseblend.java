package L18_decorator;

public class Houseblend implements Beverage {
	@Override
	public int cost() {
		return 17;
	}

	@Override
	public String description() {
		return "Houseblend";
	}
}
