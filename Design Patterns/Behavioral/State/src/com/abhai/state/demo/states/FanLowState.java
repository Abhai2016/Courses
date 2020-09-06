package com.abhai.state.demo.states;

import com.abhai.state.demo.Fan;

public class FanLowState extends State {
    private final Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to medium");
        fan.setState(fan.getFanMediumState());
    }

    @Override
    public String toString() {
        return "Fan is on low";
    }
}
