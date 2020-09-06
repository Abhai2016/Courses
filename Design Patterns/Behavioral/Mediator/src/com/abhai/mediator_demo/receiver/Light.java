package com.abhai.mediator_demo.receiver;

public class Light {
    private boolean isOn = false;
    private String location = "";


    public Light() {}

    public Light(String location) {
        this.location = location;
    }


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
