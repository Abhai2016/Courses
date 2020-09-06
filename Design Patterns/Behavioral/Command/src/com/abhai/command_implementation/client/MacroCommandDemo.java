package com.abhai.command_implementation.client;

import com.abhai.command_implementation.commands.AllLightsCommand;
import com.abhai.command_implementation.commands.Command;
import com.abhai.command_implementation.commands.ToggleCommand;
import com.abhai.command_implementation.invoker.Switch;
import com.abhai.command_implementation.receiver.Light;

import java.util.ArrayList;
import java.util.List;

public class MacroCommandDemo {
    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand); // turns on bedroomLight

        toggleCommand = new ToggleCommand(kitchenLight);
        lightSwitch.storeAndExecute(toggleCommand); // turns on kitchenLight

        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand); // turns off all lights
    }
}
