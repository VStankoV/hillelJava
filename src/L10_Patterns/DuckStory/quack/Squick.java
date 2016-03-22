package L10_Patterns.DuckStory.quack;

public class Squick implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("squick");
	}
}
