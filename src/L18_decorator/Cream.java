package L18_decorator;

public class Cream extends BeverageDecorator {
	public Cream(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return 3 + super.cost();
	}

	@Override
	public String description() {
		return super.description() + ", cream";
	}
}
