package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");

        String message = "Hello UDP Server";
        byte[] buffer = message.getBytes();

        DatagramPacket packet =
                new DatagramPacket(buffer, buffer.length, address, 6000);

        socket.send(packet);
        socket.close();
    }
}
