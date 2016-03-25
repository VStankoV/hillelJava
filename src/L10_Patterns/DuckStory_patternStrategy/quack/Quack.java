package L10_Patterns.DuckStory_patternStrategy.quack;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("quack");
	}
}
