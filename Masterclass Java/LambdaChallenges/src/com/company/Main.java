package com.company;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // Challenge №1 - write this as a lambda expression

        /*
         new Thread(new Runnable() {
             @Override
             public void run() {
                 String myString = "Let's split this up into an array";
                 String[] parts = myString.split(" ");
                 for (String part : parts)
                     System.out.println(part);
             }
         }).start();
         */

	    new Thread(() -> {
	        String myString = "Let's split this up into an array";
	        String[] parts = myString.split(" ");
	        for (String part : parts)
                System.out.println(part);
        }).start();


	    // Challenge №2
        /*
         public static String everySecondChar(String source) {
             StringBuilder returnValue = new StringBuilder();
             for (int i = 0; i < source.length(); i++)
                 if (i % 2 == 1)
                     returnValue.append(source.charAt(i));
             return returnValue.toString();
         */

        Function<String, String> everySecondChar = (source -> {
            StringBuilder returnValue = new StringBuilder();
            for (int i = 0; i < source.length(); i++)
                if (i % 2 == 1)
                    returnValue.append(source.charAt(i));
            return returnValue.toString();
        });

        // Challenge №3 - use our function
        System.out.println("Challenge №3: " + everySecondChar.apply("1234567890"));

        // Challenge №5 - use our function everySecondCharacter
        System.out.println("Challenge №5: " + everySecondCharacter(everySecondChar, "1234567890"));

        // Challenge №6 - write a Supplier
        // Supplier<String> iLoveJava = () - > { return "I Love Java" };
        Supplier<String> iLoveJava = () -> "I Love Java!";

        // Challenge №7 - use Supplier
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    // Challenge №4
    private static String everySecondCharacter(Function<String, String> everySecondChar, String source) {
        return everySecondChar.apply(source);
    }
}
