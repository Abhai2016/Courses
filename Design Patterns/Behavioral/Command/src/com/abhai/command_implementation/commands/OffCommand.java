package com.abhai.command_implementation.commands;

import com.abhai.command_implementation.receiver.Light;

public class OffCommand implements Command {
    private Light light;


    public OffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
