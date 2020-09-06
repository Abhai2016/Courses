package com.abhai.chain_of_responsibility;

import com.abhai.chain_of_responsibility.handlers.CEO;
import com.abhai.chain_of_responsibility.handlers.Director;
import com.abhai.chain_of_responsibility.handlers.VP;
import com.abhai.chain_of_responsibility.request.Request;
import com.abhai.chain_of_responsibility.request.RequestType;

public class Main {
    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request); // will go to successor(crystal) so will be same as line below
//      crystal.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request); // will go to successor(jeff) so will be same as line below
//      jeff.handleRequest(request);
    }
}
