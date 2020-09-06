package com.abhai.command_implementation.receiver;

public class Light {
    private boolean isOn = false;


    public boolean isOn() {
        return isOn;
    }

    public void on() {
        System.out.println("Light switched on");
    }

    public void off() {
        System.out.println("Light switched off");
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }
}
