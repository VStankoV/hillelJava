package L18_decorator;

import java.util.TreeSet;

public class Arabica implements Beverage {
	@Override
	public int cost() {
		return 10;
	}

	@Override
	public String description() {
		return "Arabica";
	}


}
