package com.abhai.decorator.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            file.createNewFile();

            OutputStream outputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeChars("text");

            dataOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
