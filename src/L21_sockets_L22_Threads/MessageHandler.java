package L21_sockets_L22_Threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MessageHandler implements Runnable{
	private Socket socket;

	public MessageHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (Socket socket1 = this.socket;
		     BufferedReader reader = new BufferedReader(new InputStreamReader(socket1.getInputStream()))) {
			while (true) {
				String message = reader.readLine();
				if (message == null) {
					break;
				}
				System.out.println(message);
			}
		} catch (IOException ignored) {
		}

	}
}
