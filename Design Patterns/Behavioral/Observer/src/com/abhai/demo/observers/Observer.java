package com.abhai.demo.observers;

import com.abhai.demo.subjects.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
