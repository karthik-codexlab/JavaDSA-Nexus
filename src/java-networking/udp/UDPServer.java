package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6000);
        byte[] buffer = new byte[1024];

        System.out.println("UDP Server started");

        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Client: " + message);
        }
    }
}
