package com.abhai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            System.out.println("Client connected");
            BufferedReader input = new BufferedReader(new InputStreamReader((socket.getInputStream())));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                // Thread.sleep(10000);
                String echoString = input.readLine();
                System.out.println("Received client's text : " + echoString);
                if (echoString.equals("exit"))
                    break;
                output.println("Echo from server: " + echoString);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                socket.close();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
