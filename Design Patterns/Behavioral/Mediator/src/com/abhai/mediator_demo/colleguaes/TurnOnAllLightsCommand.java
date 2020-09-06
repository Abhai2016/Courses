package com.abhai.mediator_demo.colleguaes;

import com.abhai.mediator_demo.mediators.Mediator;

public class TurnOnAllLightsCommand implements Command {
    private Mediator mediator;


    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
