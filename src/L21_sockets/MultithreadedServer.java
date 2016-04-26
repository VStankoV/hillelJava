package L21_sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedServer {
	private ServerSocket serverSocket;

	public MultithreadedServer() {
		try {
			this.serverSocket = new ServerSocket(3502);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void start(){
		try {


			while (true) {
				Socket socket = serverSocket.accept();
				new Thread(new MessageHandler(socket)).start();
			}


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MultithreadedServer().start();
	}
}
