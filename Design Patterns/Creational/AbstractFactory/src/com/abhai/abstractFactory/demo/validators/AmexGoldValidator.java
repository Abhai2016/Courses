package com.abhai.abstractFactory.demo.validators;

import com.abhai.abstractFactory.demo.abstractProduct.CreditCard;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
