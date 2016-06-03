package L28_static_Singleton;

public class Krishna implements God {
	@Override
	public void create() {
		System.out.println("Create universe instantly");

	}

	@Override
	public void heal() {
		System.out.println("Think about good thing`s");

	}

	@Override
	public String getName() {
		return "Krishna";
	}
}
