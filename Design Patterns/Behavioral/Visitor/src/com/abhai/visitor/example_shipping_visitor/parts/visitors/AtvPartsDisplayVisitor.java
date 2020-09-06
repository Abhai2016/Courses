package com.abhai.visitor.example_shipping_visitor.parts.visitors;

import com.abhai.visitor.example_shipping_visitor.parts.parts.Fender;
import com.abhai.visitor.example_shipping_visitor.parts.parts.Oil;
import com.abhai.visitor.example_shipping_visitor.parts.parts.PartsOrder;
import com.abhai.visitor.example_shipping_visitor.parts.parts.Wheel;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a wheel");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have an oil");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("We have a fender");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an order");
    }
}
