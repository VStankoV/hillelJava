package L24_producer_consummer;

public class Producer implements Runnable {
	private Bucket bucket;

	public Producer(Bucket bucket) {
		this.bucket = bucket;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			bucket.put();
		}
	}
}
