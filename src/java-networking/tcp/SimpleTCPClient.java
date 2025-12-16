package tcp;

import java.io.*;
import java.net.Socket;

public class SimpleTCPClient {

    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(host, port)) {

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            System.out.println("Connected to server. Type messages:");

            String message;
            while ((message = input.readLine()) != null) {
                out.println(message);
                System.out.println(in.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
