package L10_Patterns.DuckStory;

public abstract class Duck {

	public void fly() {
		System.out.println("i am flying!");
	}

	public void swim() {
		System.out.println("i am swiming");
	}

	public void quack() {
		System.out.println("i am quacking");
	}

	public abstract void display();

}
