package com.abhai.command_implementation.commands;

import com.abhai.command_implementation.receiver.Light;

public class OnCommand implements Command {
    private Light light;


    public OnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
