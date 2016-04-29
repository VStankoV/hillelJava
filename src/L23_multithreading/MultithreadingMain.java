package L23_multithreading;

public class MultithreadingMain {
	public static void main(String[] args) {
//		Thread currentThread = Thread.currentThread();


		Runnable runnable = () -> {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 10; i++){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
//					e.printStackTrace();
					Thread.currentThread().interrupt();     //буждение потока вовремя сна
										// чревато выбросом InterExept и неустановкой флага
										// isInterrupted который нужно установить вручную
				}

				System.out.println(name + ": "+i);

				if (Thread.currentThread().isInterrupted()){    //check flag isInter-d
					return;
				}
			}

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};


		Thread anotherThread = new Thread(runnable);
		anotherThread.start();

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


//		anotherThread.stop();
		anotherThread.interrupt();      //ask anotherThread to stop and set flag isInterrupted


		System.out.println("wait on second thread");

		try {
			anotherThread.join();       //block current thread execution
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println("finish");


	}
}
