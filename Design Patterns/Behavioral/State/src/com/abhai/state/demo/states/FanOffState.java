package com.abhai.state.demo.states;

import com.abhai.state.demo.Fan;

public class FanOffState extends State {
    private final Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to low");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
