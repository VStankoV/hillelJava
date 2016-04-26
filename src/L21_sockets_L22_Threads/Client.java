package L21_sockets_L22_Threads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		new Client().start();
	}

	public void start() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String mess = scanner.nextLine();
			if (mess.equals("exit")) {
				break;
			}
			send(mess);
		}
	}

	private void send(String mess) {
		try (Socket socket = new Socket("192.168.1.111", 3502);
		     PrintWriter writer = new PrintWriter(socket.getOutputStream())) {

			writer.print(mess);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
