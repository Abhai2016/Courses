package com.abhai.prototype.demo;

import com.abhai.prototype.demo.items.Movie;

public class Demo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getRuntime());
        System.out.println(movie.getPrice());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getPrice());
    }
}
