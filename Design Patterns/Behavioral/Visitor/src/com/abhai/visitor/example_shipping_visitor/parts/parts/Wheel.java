package com.abhai.visitor.example_shipping_visitor.parts.parts;

import com.abhai.visitor.example_shipping_visitor.parts.visitors.AtvPartVisitor;

public class Wheel implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
