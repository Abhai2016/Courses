package com.abhai.command_implementation.client;

import com.abhai.command_implementation.commands.Command;
import com.abhai.command_implementation.commands.ToggleCommand;
import com.abhai.command_implementation.invoker.Switch;
import com.abhai.command_implementation.receiver.Light;

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light(); // receiver
        Switch lightSwitch = new Switch(); // invoker

        /*
         Command onCommand = new OnCommand(light); // concrete command with command's interface
         lightSwitch.storeAndExecute(onCommand);
        */
        Command toggleCommand = new ToggleCommand(light);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
    }
}
