package com.abhai.visitor.example_shipping_visitor.parts.parts;

import com.abhai.visitor.example_shipping_visitor.parts.visitors.AtvPartVisitor;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
