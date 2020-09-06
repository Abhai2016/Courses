package com.abhai.strategy.demo.strategies;

import com.abhai.strategy.demo.CreditCard;

public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("4");

        if (isValid)
            isValid = creditCard.getNumber().length() == 16;

        if (isValid)
            isValid = validateCreditCardNumber(creditCard.getNumber());

        return isValid;
    }
}
