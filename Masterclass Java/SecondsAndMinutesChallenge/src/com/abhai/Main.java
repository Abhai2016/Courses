package com.abhai;

public class Main {
    private static final String INVALID_MESSAGE_TEXT = "Invalid values";

    public static void main(String[] args) {
        System.out.println(getDurationString(89, 59));
        System.out.println((getDurationString(134, 39)));
        System.out.println(getDurationString(134));
        System.out.println(getDurationString(3890));
        System.out.println(getDurationString(9));
    }


    private static String getDurationString(int minutes, int seconds)
    {
        if (minutes < 0 || seconds > 59 || seconds < 0) {
            return INVALID_MESSAGE_TEXT;
        }
        else {
            String hours = (minutes / 60) < 10 ? "0" + (minutes / 60) : Integer.toString(minutes / 60);
            String minutesString = (minutes % 60) < 10 ? "0" + (minutes % 60) : Integer.toString(minutes % 60);
            String secondsString = seconds < 10 ? "0" + seconds : Integer.toString(seconds);

            return hours + "h " + minutesString + "m " + secondsString + "s";
        }
    }


    private static String getDurationString(int seconds) {
        if (seconds < 0)
            return INVALID_MESSAGE_TEXT;
        else {
            return getDurationString(seconds / 60, seconds % 60);
        }
    }
}
