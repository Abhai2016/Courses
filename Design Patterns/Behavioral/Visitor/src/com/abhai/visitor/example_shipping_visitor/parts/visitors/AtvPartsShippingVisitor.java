package com.abhai.visitor.example_shipping_visitor.parts.visitors;

import com.abhai.visitor.example_shipping_visitor.parts.parts.*;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {
    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("Wheels are pretty expensive");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oil a bit cheaper than wheels");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("Fenders are not expensive");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they bought more than 3 things we will give them a discount on shipping");
        List<AtvPart> parts = partsOrder.getParts();
        if (parts.size() > 3)
            shippingAmount -= 5;
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}
