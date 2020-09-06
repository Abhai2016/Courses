package com.abhai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        sortArray(array);
        printArray(array);

        int[] array2 = getIntegers(10);
        sortArray(array2);
        printArray(array2);
    }

    private static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];

        int counter = 0;
        while (counter < capacity) {
            System.out.println("Enter number #" + (counter + 1) + " of " + capacity);

            if (scanner.hasNextInt()) {
                array[counter] = scanner.nextInt();
                counter++;
            } else
                System.out.println("Invalid number, try again");

            scanner.nextLine();
        }
        
        return array;
    }


    private static void sortArray(int[] array) {
        int temp;

        for(int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("array[" + i + "] = " + array[i]);
    }
}
