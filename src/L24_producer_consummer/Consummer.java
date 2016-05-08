package L24_producer_consummer;

public class Consummer implements Runnable {
	private Bucket bucket;

	public Consummer(Bucket bucket) {
		this.bucket = bucket;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			bucket.get();
		}
	}
}

