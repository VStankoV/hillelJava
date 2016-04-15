package L18_decorator;

import java.util.ArrayList;
import java.util.List;

public class DecoratorMain {
	public static void main(String[] args) {

		Beverage arabica = new Arabica();
		arabica = new Milk(arabica);
		arabica = new Milk(arabica);

		Beverage robusta = new Robusta();


		printBeverage(arabica);
		printBeverage(robusta);



	}

	public static void printBeverage (Beverage beverage) {

		System.out.println(beverage.description()  + ", " + beverage.cost());

	}
}
