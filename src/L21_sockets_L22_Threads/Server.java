package L21_sockets_L22_Threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
	HashMap<InetAddress,String> map = new HashMap<>();

	public static void main(String[] args) {
		new Server().start();
	}

	public void start() {
		try (ServerSocket serverSocket = new ServerSocket(3502)) {

			while (true) {
				Socket socket = serverSocket.accept();
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				try {
					String message = reader.readLine();

					if (message.contains("my name ")){
						message = message.replace("my name ","");


					}



					System.out.println();



				} catch (IOException ignor) {
				}
				reader.close();
				socket.close();
			}


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
