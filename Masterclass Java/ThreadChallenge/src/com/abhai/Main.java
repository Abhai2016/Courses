package com.abhai;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345-678", 1000.00);

        new Thread() {
            @Override
            public void run() {
                bankAccount.deposit(300.00);
                bankAccount.withdraw(50.00);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                bankAccount.deposit(203.75);
                bankAccount.withdraw(100.00);
            }
        }.start();
    }
}
