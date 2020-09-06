package com.abhai.collections.equals_hashCode;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        ticket1.number = 123;

        Book book = new Book();
        book.author = "Sherlock";
        book.name = "How To Get Friends";

        HashMap<Ticket, Book> library = new HashMap<>();
        library.put(ticket1, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 123;

        Book book2 = library.get(ticket1);
        Book book3 = library.get(ticket2); // gives an exception NullPointerException if we don't Override equals() and hashCode()

        System.out.println(book2.author);
        System.out.println(book3.author);
    }
}
