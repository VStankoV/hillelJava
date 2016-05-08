package L24_producer_consummer;

public class Main {
	public static void main(String[] args) {
		Bucket bucket = new Bucket();
		Thread consummerThread = new Thread(new Consummer(bucket));
		Thread producerThread = new Thread(new Producer(bucket));

		consummerThread.start();
		producerThread.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		consummerThread.interrupt();
		producerThread.interrupt();

		try {
			consummerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			producerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All threads are stopped!");
		System.out.println(bucket);
	}
}
