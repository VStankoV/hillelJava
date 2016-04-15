package L18_decorator;

public abstract class BeverageDecorator implements Beverage {
	private Beverage beverage;

	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public int cost() {
		return beverage.cost();
	}

	public String description () {
		return beverage.description();
	}

}
