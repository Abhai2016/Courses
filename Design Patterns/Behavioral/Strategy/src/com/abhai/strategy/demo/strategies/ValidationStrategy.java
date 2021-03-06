package com.abhai.strategy.demo.strategies;

import com.abhai.strategy.demo.CreditCard;

public abstract class ValidationStrategy {
    public abstract boolean isValid(CreditCard creditCard);

    protected boolean validateCreditCardNumber(String str) {
        int[] ints = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
            ints[i] = Integer.parseInt(str.substring(i, i + 1));

        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }

        int sum = 0;
        for (int i = 0; i < ints.length; i++)
            sum += ints[i];

        return (sum % 10 == 0);
    }
}
