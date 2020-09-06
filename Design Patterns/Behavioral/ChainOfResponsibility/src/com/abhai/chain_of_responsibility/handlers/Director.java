package com.abhai.chain_of_responsibility.handlers;

import com.abhai.chain_of_responsibility.request.Request;
import com.abhai.chain_of_responsibility.request.RequestType;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE)
            System.out.println("Director can approve conferences");
        else
            successor.handleRequest(request);
    }
}
