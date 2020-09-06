package com.abhai.command_implementation.commands;

import com.abhai.command_implementation.receiver.Light;

public class ToggleCommand implements Command {
    private Light light;


    public ToggleCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.toggle();
    }
}
