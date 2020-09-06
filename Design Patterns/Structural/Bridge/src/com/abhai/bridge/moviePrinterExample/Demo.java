package com.abhai.bridge.moviePrinterExample;

import com.abhai.bridge.moviePrinterExample.formatters.Formatter;
import com.abhai.bridge.moviePrinterExample.formatters.HtmlFormatter;
import com.abhai.bridge.moviePrinterExample.formatters.PrintFormatter;
import com.abhai.bridge.moviePrinterExample.models.Movie;
import com.abhai.bridge.moviePrinterExample.printers.MoviePrinter;
import com.abhai.bridge.moviePrinterExample.printers.Printer;

public class Demo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String result = moviePrinter.print(printFormatter);
        System.out.println(result);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlResult = moviePrinter.print(htmlFormatter);
        System.out.println(htmlResult);
    }
}
