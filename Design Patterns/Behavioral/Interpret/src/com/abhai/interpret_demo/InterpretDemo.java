package com.abhai.interpret_demo;

import com.abhai.interpret_demo.expressions.Expression;
import com.abhai.interpret_demo.expressions.OrExpression;
import com.abhai.interpret_demo.expressions.TerminalExpression;

public class InterpretDemo {
    public static void main(String[] args) {
        String context = "Lions";
        Expression defineLions = buildInterpreterTree();
        System.out.println(context + " is " + defineLions.interpret(context));
    }

    private static Expression buildInterpreterTree() {
        Expression lions = new TerminalExpression("Lions");
        Expression tigers = new TerminalExpression("Tigers");
        Expression bears = new TerminalExpression("Bears");

        return new OrExpression(tigers, lions);
    }
}
