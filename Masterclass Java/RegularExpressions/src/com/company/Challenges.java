package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenges {
    public static void main(String[] args) {
        // Challenge №1
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        // Challenge №2
        String regularExpression = "I want a \\w+.";
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches(regularExpression));
        System.out.println(challenge2.matches(regularExpression));

        // or
        // String regularExpression2 = "I want a (bike|ball).";
        // System.out.println(challenge1.matches(regularExpression2));
        // System.out.println(challenge2.matches(regularExpression2));

        // Challenge №3
        String regularExpression3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regularExpression3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        // Challenge №4
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        // Challenge №5
        String challenge5 = "aaabccccccccddddddeeeeeeefgggg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        // Challenge №6
        System.out.println(challenge5.matches("a{3}bc{8}d{6}e{7}fg{4}")); // System.out.println(challenge5.matches("^a{3}bc{8}d{6}e{7}fg{4}$"));

        // Challenge №7
        String challenge7 = "abcd.12";
        System.out.println(challenge7.matches("[A-z][a-z]+\\.\\d+"));

        // Challenge №8
        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern2 = Pattern.compile("\\d+"); // [A-Za-z]+\\.(\\d+)
        Matcher matcher2 = pattern2.matcher(challenge8);
        while(matcher2.find()) {
            System.out.println("Occurrence : " + matcher2.group(0));
        }

        // Challenge №9
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()) {
            System.out.println("Occurrence: " + matcher9.group(1));
        }

        // Challenge №10
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);
        while(matcher10.find()) {
            System.out.println("Occurrence: start = " + matcher10.start(1) + " end = " + (matcher10.end(1) -1));
        }

        // Challenge №11
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()) {
            System.out.println("Occurrence: " + matcher11.group(1));
        }
        System.out.println("*********************");

        // Challenge №11a
        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 34}, {11, 12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while(matcher11a.find()) {
            System.out.println("Occurrence: " + matcher11a.group(1));
        }

        // Challenge №12
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));

        // Challenge №13
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));
    }
}
