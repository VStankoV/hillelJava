package L10_Patterns.DuckStory_patternStrategy.quack;

public class Squick implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("squick");
	}
}
