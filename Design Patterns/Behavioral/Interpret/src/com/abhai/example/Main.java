package com.abhai.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "Lions and tigers are not friends with bears. Oh my!";

        Pattern pattern = Pattern.compile("lions|tigers|my|My|bears");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find())
            System.out.println("Found a " + matcher.group());
    }
}
