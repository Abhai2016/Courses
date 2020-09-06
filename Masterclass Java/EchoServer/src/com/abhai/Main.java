package com.abhai;

import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            new Echoer(serverSocket.accept()).start();
            // Socket socket = serverSocket.accept();
            // Echoer echoer = new Echoer(socket);
            // echoer.start();
        } catch (Exception exception) {
            System.out.println("Server exception: " + exception.getMessage());
        }
    }
}
