package com.abhai.abstractFactory.demo.concreteFactories;

import com.abhai.abstractFactory.demo.abstractFactory.CreditCardFactory;
import com.abhai.abstractFactory.demo.abstractProduct.CreditCard;
import com.abhai.abstractFactory.demo.abstractProduct.CreditCardType;
import com.abhai.abstractFactory.demo.concreteProducts.AmexGoldCreditCard;
import com.abhai.abstractFactory.demo.concreteProducts.AmexPlatinumCreditCard;
import com.abhai.abstractFactory.demo.validators.AmexGoldValidator;
import com.abhai.abstractFactory.demo.validators.AmexPlatinumValidator;
import com.abhai.abstractFactory.demo.validators.Validator;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CreditCardType creditCardType) {
        switch (creditCardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CreditCardType creditCardType) {
        switch (creditCardType) {
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
            default:
                return null;
        }
    }
}
