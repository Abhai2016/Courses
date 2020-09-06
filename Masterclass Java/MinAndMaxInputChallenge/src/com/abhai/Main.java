package com.abhai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;

        while (true) {
            System.out.println("Enter the number");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number > max)
                    max = number;
                if (number < min)
                    min = number;
            }
            else
                break;

            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
