package com.abhai.proxy.example;

public class Main {
    public static void main(String[] args) {
        TwitterService twitterService = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(twitterService.getTimeline("b81"));
//        twitterService.postToTimeline("Abhai", "Some message that shouldn't be here"); - post are not allowed :P
    }
}
