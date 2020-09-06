package com.abhai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate digits' sum");

        if (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            scanner.close();

            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            System.out.println(sum);
        }
        else
            System.out.println("Invalid value");
    }
}
