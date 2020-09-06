package com.abhai;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 5, 6, 4, 10, 14, 15};

        for (int value : array)
            System.out.print(value + " ");

        reverse(array);
        System.out.println();

        for (int value : array)
            System.out.print(value + " ");

    }


    private static void reverse(int[] array) {
        int length = array.length - 1;
        int medium = array.length / 2;
        int temp = 0;

        for (int i = 0; i < medium; i++) {
            temp = array[i];
            array[i] = array[length - i];
            array[length - i] = temp;
        }
    }
}
