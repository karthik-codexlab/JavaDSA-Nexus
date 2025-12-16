package multithreaded;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7000);
        System.out.println("Multi-client server running on port 7000");

        while (true) {
            Socket client = serverSocket.accept();
            new ClientHandler(client).start();
        }
    }
}

class ClientHandler extends Thread {

    private final Socket socket;

    ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true)
        ) {
            String message;
            while ((message = in.readLine()) != null) {
                out.println("Echo: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
