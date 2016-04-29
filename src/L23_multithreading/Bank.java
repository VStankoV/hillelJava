package L23_multithreading;

public class Bank {
	private long account1 = 10_000_000;
	private long account2 = 10_000_000;

	private final Object lock = new Object();

	public synchronized void transfer(boolean direction, int amount){   //synchronized - just one thread can use method
		if (direction){                             //synchronized устанавл блок(флаг блокед) на объект
			account1 -= amount;
			account2 += amount;
		} else {
			account2 -= amount;
			account1 += amount;

		}
	}

	public void check(){        //если объект заблокирован то несинхронайзед методы можно посещать
		String message = "";

		synchronized (this){        //но здесь выполн-ся проверка объекта на заблокированность
			if (account1 + account2 != 20_000_000){
				message = "Something wrong happened!";
			}
			message += "Acc1 " + account1;
			message += "Acc2 " + account2;
		}


		System.out.println(message);




	}
}
