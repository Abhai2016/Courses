package com.abhai.abstractFactory.demo.abstractFactory;

import com.abhai.abstractFactory.demo.abstractProduct.CreditCard;
import com.abhai.abstractFactory.demo.abstractProduct.CreditCardType;
import com.abhai.abstractFactory.demo.concreteFactories.AmexFactory;
import com.abhai.abstractFactory.demo.concreteFactories.VisaFactory;
import com.abhai.abstractFactory.demo.validators.Validator;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650)
            return new AmexFactory();
        else
             return new VisaFactory();
    }

    public abstract CreditCard getCreditCard(CreditCardType creditCardType);
    public abstract Validator getValidator(CreditCardType creditCardType);
}
