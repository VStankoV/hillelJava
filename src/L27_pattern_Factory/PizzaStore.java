package L27_pattern_Factory;

public class PizzaStore {
	public Pizza order(String region, String type) {

		Pizza pizza;

		pizza = getPizza(region, type);

		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	private Pizza getPizza(String region, String type) {
		Pizza pizza = null;
		if (region.equals("CH")) {
			switch (type) {
				case "Cheese":
					pizza = new CHCheesePizza();
					break;
				case "Meat":
					pizza = new CHMeatPizza();
					break;

				default:
					throw new RuntimeException(type);
			}
		} else if (region.equals("NY")) {
			switch (type) {
				case "Cheese":
					pizza = new NYCheesePizza();
					break;
				case "Meat":
					pizza = new NYMeatPizza();
					break;
				default:
					throw new RuntimeException(type);
			}

		}
		return pizza;
	}
}
