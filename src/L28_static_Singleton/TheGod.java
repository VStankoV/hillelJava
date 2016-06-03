package L28_static_Singleton;

public class TheGod implements God {
	private static TheGod instance;

	public static TheGod getInstace() {
		if (instance == null) {
			instance = new TheGod();        //lazy singleton
		}

		return instance;
	}

	public TheGod() {
		System.out.println("God always been there!");
	}

	@Override
	public void create() {
		System.out.println("All the world in 7 days");
	}

	@Override
	public void heal() {
		System.out.println("Stand and go!");
	}

	@Override
	public String getName() {
		return "God";
	}

	static public void prophet(){
		System.out.println("Jesus");
	}
}
