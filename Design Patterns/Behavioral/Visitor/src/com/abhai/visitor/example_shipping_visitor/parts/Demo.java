package com.abhai.visitor.example_shipping_visitor.parts;

import com.abhai.visitor.example_shipping_visitor.parts.parts.*;
import com.abhai.visitor.example_shipping_visitor.parts.visitors.AtvPartsDisplayVisitor;
import com.abhai.visitor.example_shipping_visitor.parts.visitors.AtvPartsShippingVisitor;

public class Demo {
    public static void main(String[] args) {
        PartsOrder parts = new PartsOrder();
        parts.addPart(new Fender());
        parts.addPart(new Oil());
        parts.addPart(new Wheel());

        parts.accept(new AtvPartsShippingVisitor());
        parts.accept(new AtvPartsDisplayVisitor());
    }
}
