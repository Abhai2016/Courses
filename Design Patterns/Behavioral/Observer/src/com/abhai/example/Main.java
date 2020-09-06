package com.abhai.example;

import com.abhai.example.observers.Client;
import com.abhai.example.subjects.TwitterStream;

public class Main {
    public static void main(String[] args) {
        TwitterStream twitterStream = new TwitterStream();
        Client client1 = new Client("Bryan");
        Client client2 = new Client("Mark");

        twitterStream.addObserver(client1);
        twitterStream.addObserver(client2);

        twitterStream.someoneTweeted();
    }
}
