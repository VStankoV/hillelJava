package L10_Patterns.DuckStory_patternStrategy;

public class DucksMain {
	public static void main(String[] args) {
		Duck duck = new RubberDuck();

		duck.display();
		duck.quack();

	}

}
