package L21_sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SlowClient {
	private Socket socket;

	public SlowClient() {
		try {
			socket = new Socket("192.168.1.111", 3502);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {

		try (PrintWriter writer = new PrintWriter(socket.getOutputStream());
		     Scanner scanner = new Scanner(System.in)) {
			while (true) {
				String mess = scanner.nextLine();
				System.out.println("the mess is " + mess);
//				if (mess.equals("exit")) {
//					break;
//				}
				writer.print(mess);
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public static void main(String[] args) {
		new SlowClient().start();
	}
}