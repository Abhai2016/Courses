package com.abhai.chain_of_responsibility.handlers;

import com.abhai.chain_of_responsibility.request.Request;
import com.abhai.chain_of_responsibility.request.RequestType;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE)
            if (request.getAmount() < 1500)
                System.out.println("VPs can approve purchases below 1500");
            else
                successor.handleRequest(request);
    }
}
