package com.abhai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (counter < 11) {
            System.out.println("Enter number #" + counter);

            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            }
            else
                System.out.println("Invalid number, try again");

            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Sum = " + sum);
    }
}
