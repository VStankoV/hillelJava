package L23_multithreading;

import java.util.Random;

public class Bankier implements Runnable{
	private Bank bank;
	private Random random = new Random();

	public Bankier(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run(){
		while (!Thread.currentThread().isInterrupted()) {
			int amount = random.nextInt(1000) + 1;
			boolean direction = random.nextBoolean();

			bank.transfer(direction,amount);

		}
	}
}
