package com.abhai.abstractFactory.demo.concreteFactories;

import com.abhai.abstractFactory.demo.abstractFactory.CreditCardFactory;
import com.abhai.abstractFactory.demo.abstractProduct.CreditCard;
import com.abhai.abstractFactory.demo.abstractProduct.CreditCardType;
import com.abhai.abstractFactory.demo.concreteProducts.AmexGoldCreditCard;
import com.abhai.abstractFactory.demo.concreteProducts.AmexPlatinumCreditCard;
import com.abhai.abstractFactory.demo.concreteProducts.VisaGoldCreditCard;
import com.abhai.abstractFactory.demo.concreteProducts.VisaPlatinumCreditCard;
import com.abhai.abstractFactory.demo.validators.*;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CreditCardType creditCardType) {
        switch (creditCardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CreditCardType creditCardType) {
        switch (creditCardType) {
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
            default:
                return null;
        }
    }
}
