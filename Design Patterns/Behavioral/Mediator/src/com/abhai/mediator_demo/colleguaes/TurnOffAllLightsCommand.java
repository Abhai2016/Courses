package com.abhai.mediator_demo.colleguaes;

import com.abhai.mediator_demo.mediators.Mediator;

public class TurnOffAllLightsCommand implements Command {
    private Mediator mediator;


    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
