package com.abhai.abstractFactory.demo.validators;

import com.abhai.abstractFactory.demo.abstractProduct.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
