package com.abhai;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(5000);
            while(true) {
                byte[] buffer = new byte[50];
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(datagramPacket);
                System.out.println("Received text is: " + new String(buffer, 0, datagramPacket.getLength()));

                String returnString = "echo: " + new String(buffer, 0, datagramPacket.getLength());
                byte[] buffer2 = returnString.getBytes();
                InetAddress inetAddress = datagramPacket.getAddress();
                int port = datagramPacket.getPort();
                datagramPacket = new DatagramPacket(buffer2, buffer2.length, inetAddress, port);
                datagramSocket.send(datagramPacket);
            }
        } catch (IOException socketException) {
            System.out.println(socketException.getMessage());
        }
    }
}
