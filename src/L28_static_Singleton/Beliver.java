package L28_static_Singleton;

public class Beliver {
	static God god;
	String name;

	@Override
	public String toString() {
		return "my name is " + name + " and I belive in " + god.getName();
	}
}
