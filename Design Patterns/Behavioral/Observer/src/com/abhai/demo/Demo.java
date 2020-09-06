package com.abhai.demo;

import com.abhai.demo.observers.PhoneClient;
import com.abhai.demo.observers.TabletClient;
import com.abhai.demo.subjects.MessageStream;
import com.abhai.demo.subjects.Subject;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();
        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here's a new message");
        tabletClient.addMessage("Here's a new message");
    }
}
