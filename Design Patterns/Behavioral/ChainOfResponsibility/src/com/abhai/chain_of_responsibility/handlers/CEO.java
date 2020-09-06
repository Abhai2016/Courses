package com.abhai.chain_of_responsibility.handlers;

import com.abhai.chain_of_responsibility.request.Request;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
