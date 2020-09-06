package com.abhai;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            DatagramSocket datagramSocket = new DatagramSocket();

            Scanner scanner = new Scanner(System.in);
            String echoString;

            do {
                System.out.println("Enter the echoString");
                echoString = scanner.nextLine();

                byte[] buffer = echoString.getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, inetAddress, 5000);
                datagramSocket.send(datagramPacket);

                byte[] buffer2 = new byte[50];
                datagramPacket = new DatagramPacket(buffer2, buffer2.length);
                datagramSocket.receive(datagramPacket);
                System.out.println("Received text is: " + new String(buffer2, 0, buffer2.length));
            } while(!echoString.equals("exit"));
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
