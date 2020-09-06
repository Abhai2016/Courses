package com.abhai.abstractFactory.demo;

import com.abhai.abstractFactory.demo.abstractFactory.CreditCardFactory;
import com.abhai.abstractFactory.demo.abstractProduct.CreditCard;
import com.abhai.abstractFactory.demo.abstractProduct.CreditCardType;

public class Demo {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CreditCardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CreditCardType.GOLD);
        System.out.println(card2.getClass());
    }
}
