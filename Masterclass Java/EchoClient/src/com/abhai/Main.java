package com.abhai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            // socket.setSoTimeout(5000);
            BufferedReader echoInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter echoOutput = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;

            do {
                System.out.println("Enter the echoString: ");
                echoString = scanner.nextLine();

                echoOutput.println(echoString);
                if (!echoString.equals("exit")) {
                    response = echoInput.readLine();
                    System.out.println(response);
                }
            } while (!echoString.equals("exit"));
        } catch (IOException ioException) {
            System.out.println("Client exception: " + ioException.getMessage());
        }
    }
}
