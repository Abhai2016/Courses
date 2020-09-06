package com.abhai;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final String accountNumber;
    private final ReentrantLock reentrantLock;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        reentrantLock = new ReentrantLock();
    }

    public boolean deposit(double amount) {
        boolean status = false;

        /* First method
        * reentrantLock.lock();
        * critical code
        * reentrantLock.unlock();
        */

        /* Second method
         * synchronized (this) { critical code }
         */

        // Third method
        try {
            if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = true;
                    System.out.println("Deposit on " + amount + " Balance = " + balance);
                } finally {
                    reentrantLock.unlock();
                }
            } else
                System.out.println("Couldn't get the lock");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Transaction's status is " + status);
        return status;
    }

    public void withdraw(double amount) {
        boolean status = false;
        try {
            if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                    System.out.println("Withdraw on " + amount + " Balance = " + balance);
                } finally {
                    reentrantLock.unlock();
                }
            } else
                System.out.println("Couldn't get the lock");
        } catch (InterruptedException interruptedException) {
           interruptedException.printStackTrace();
        }
        System.out.println("Transaction's status is " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("AccountNumber = " + accountNumber);
    }
}
