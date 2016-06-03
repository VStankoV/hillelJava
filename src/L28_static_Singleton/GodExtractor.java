package L28_static_Singleton;

public class GodExtractor implements Runnable{
	TheGod god;

	@Override
	public void run() {
		god = TheGod.getInstace();
	}
}
