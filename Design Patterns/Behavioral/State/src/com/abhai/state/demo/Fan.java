package com.abhai.state.demo;

import com.abhai.state.demo.states.FanLowState;
import com.abhai.state.demo.states.FanMediumState;
import com.abhai.state.demo.states.FanOffState;
import com.abhai.state.demo.states.State;

public class Fan {
    State fanOffState;
    State fanLowState;
    State fanMediumState;

    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);

        state = fanOffState;
    }


    public void pullChain() {
        state.handleRequest();
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}