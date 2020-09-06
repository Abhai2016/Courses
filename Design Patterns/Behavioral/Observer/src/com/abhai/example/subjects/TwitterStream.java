package com.abhai.example.subjects;

import java.util.Observable;

public class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}
