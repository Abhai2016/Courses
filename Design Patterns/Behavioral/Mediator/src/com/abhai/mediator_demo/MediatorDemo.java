package com.abhai.mediator_demo;

import com.abhai.mediator_demo.colleguaes.TurnOffAllLightsCommand;
import com.abhai.mediator_demo.colleguaes.TurnOnAllLightsCommand;
import com.abhai.mediator_demo.colleguaes.Command;
import com.abhai.mediator_demo.mediators.Mediator;
import com.abhai.mediator_demo.receiver.Light;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute(); 
    }
}
