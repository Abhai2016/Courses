package com.abhai.strategy.demo;

import com.abhai.strategy.demo.strategies.AmexStrategy;
import com.abhai.strategy.demo.strategies.VisaStrategy;

public class Demo {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(new AmexStrategy());

        creditCard.setNumber("379185883464283");
        creditCard.setDate("04/2020");
        creditCard.setCvv("123");

        System.out.println("CreditCard is valid: " + creditCard.isValid());

        CreditCard creditCard2 = new CreditCard(new AmexStrategy());

        creditCard2.setNumber("37918588346428123");
        creditCard2.setDate("04/2020");
        creditCard2.setCvv("123");

        System.out.println("CreditCard2 is valid: " + creditCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4298563746128594");
        visaCard.setDate("18/2020");
        visaCard.setCvv("321");

        System.out.println("VisaCard is valid: " + visaCard.isValid());
    }
}
