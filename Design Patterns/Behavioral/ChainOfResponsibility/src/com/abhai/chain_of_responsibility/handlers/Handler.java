package com.abhai.chain_of_responsibility.handlers;

import com.abhai.chain_of_responsibility.request.Request;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
