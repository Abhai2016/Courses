package com.abhai.proxy.example;

public interface TwitterService {
    public String getTimeline(String screenName);
    public void postToTimeline(String screeName, String message);
}
