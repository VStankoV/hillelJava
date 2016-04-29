package L23_multithreading;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank();

		Thread bankier_1_Thread = new Thread(new Bankier(bank));
		Thread bankier_2_Thread = new Thread(new Bankier(bank));

		bankier_1_Thread.start();
		bankier_2_Thread.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException ignored) {}

		bankier_1_Thread.interrupt();
		bankier_2_Thread.interrupt();

		try {
			bankier_1_Thread.join();
			bankier_2_Thread.join();
		} catch (InterruptedException ignored) {}


		bank.check();

	}
}
