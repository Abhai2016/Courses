package com.abhai.visitor.example_shipping_visitor.parts.visitors;

import com.abhai.visitor.example_shipping_visitor.parts.parts.Fender;
import com.abhai.visitor.example_shipping_visitor.parts.parts.Oil;
import com.abhai.visitor.example_shipping_visitor.parts.parts.PartsOrder;
import com.abhai.visitor.example_shipping_visitor.parts.parts.Wheel;

public interface AtvPartVisitor {
    void visit(Wheel wheel);
    void visit(Oil oil);
    void visit(Fender fender);
    void visit(PartsOrder partsOrder);
}
