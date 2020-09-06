package com.abhai.command_implementation.invoker;

import com.abhai.command_implementation.commands.Command;

public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
