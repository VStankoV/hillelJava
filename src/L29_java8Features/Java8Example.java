package L29_java8Features;


import L28_static_Singleton.God;
import L28_static_Singleton.TheGod;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Created by MBCNEWMAIN on 06.06.2016.
 */
public class Java8Example {
	public static void main(String[] args) {
//    God god = TheGod.getInstance();
//    god.resurect();

		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple(200, "Red", 15));
		apples.add(new Apple(250, "Green", 16));
		apples.add(new Apple(100, "Green", 11));
		apples.add(new Apple(250, "Yellow", 15));

		String message = "My name is Valera! i use java";

		UnaryOperator<String> header = m -> "Hello, " + m;
		UnaryOperator<String> corrector = m -> m.replace("java", "Java 8");
		UnaryOperator<String> footer = m -> m + " . Bye!";

//		message = header.apply(message);
//		message = corrector.apply(message);
//		message = footer.apply(message);

		System.out.println(header.andThen(corrector.andThen(footer)).apply(message));

		Function<String, String> compose = header.compose(corrector).compose(footer);

		System.out.println(compose.apply(message));


		Optional<String> someString = generate();

		if (someString.isPresent()) {
			System.out.println(someString.get());
		}

		someString.ifPresent(System.out::println);

		Object<Passport> mightBePassport = house.getRoom()
				.flatMap(Flat::getCitizen)
				.flatMap(Citizen::getPassport);



	}

	static Optional<String> generate() {
		if (Math.random() < 0.65) {
			return Optional.of("asd");
		} else {
			return Optional.empty();
		}
	}

	private static void someStuff(List<Apple> apples) {
		print(apples, apple -> String.valueOf(apple.getPrice()));

		Function<Apple, String> appleStringFunction = apple -> apple.getColor();

		print(apples, appleStringFunction);
	}

	private static void print(List<Apple> apples, Function<Apple, String> appleToString) {
		for (Apple apple : apples) {
			System.out.println(appleToString.apply(apple));
		}
	}


	private static void methodReferenceExample(List<Apple> apples) {
		Consumer<Apple> applePrinter = System.out::println;
		apples.forEach(applePrinter);
	}

	private static void functionalInterfaces(List<Apple> apples) {
		Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");

		List<Apple> greenApples = select(apples, isGreen);
		System.out.println(greenApples);

		Predicate<Apple> isHeavy = apple -> apple.getWeight() > 200;

		List<Apple> heavyApples = select(apples, isHeavy);
		System.out.println(heavyApples);

		Predicate<Apple> heavyAndGreen = isHeavy.and(isGreen);
		System.out.println(select(apples, heavyAndGreen));
	}

	public static List<Apple> select(List<Apple> apples, Predicate<Apple> tester) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : apples) {
			if (tester.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	private static void defaultSortExample(List<Apple> apples) {
		Comparator<Apple> byColor = (o1, o2) -> o1.getColor().compareTo(o2.getColor());

		byColor = Comparator.comparing(Apple::getColor);


		Comparator<Apple> byColorReversed = byColor.reversed();


		Comparator<Apple> byWeight = (o1, o2) -> Integer.compare(o1.getWeight(), o2.getWeight());

		byWeight = Comparator.comparingInt(Apple::getWeight);

		Comparator<Apple> byColorDescAndWeight = byColorReversed.thenComparing(byWeight);


//		Collections.sort(apples, byColor);
		apples.sort(byColorDescAndWeight);

		System.out.println(apples);
	}
}