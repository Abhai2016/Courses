package com.abhai.demo.observers;

import com.abhai.demo.subjects.Subject;

public class TabletClient extends Observer {

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }


    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }


    @Override
    public void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }
}
