package L28_static_Singleton;

public class Main {
	public static void main(String[] args) {

		TheGod god1;
		TheGod god2;

		GodExtractor extractor1 = new GodExtractor();
		GodExtractor extractor2 = new GodExtractor();
		Thread thread1 = new Thread(extractor1);
		Thread thread2 = new Thread(extractor2);
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}

	private static void belivers() {
		Beliver.god = new TheGod();

		Beliver ivan = new Beliver();
		ivan.name = "Ivan";

		Beliver petro = new Beliver();
		ivan.name = "Petro";
	}
}
