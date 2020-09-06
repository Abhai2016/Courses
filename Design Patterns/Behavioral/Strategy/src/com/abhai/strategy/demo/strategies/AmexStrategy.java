package com.abhai.strategy.demo.strategies;

import com.abhai.strategy.demo.CreditCard;

public class AmexStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("37") ||
                creditCard.getNumber().startsWith("34");

        if (isValid)
            isValid = creditCard.getNumber().length() == 15;

        if (isValid)
            isValid = validateCreditCardNumber(creditCard.getNumber());

        return isValid;
    }
}
