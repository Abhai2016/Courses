package com.abhai.template.demo.templates;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("doCheckout method in StoreOrder");
    }

    @Override
    public void doPayment() {
        System.out.println("doPayment method in StoreOrder");
    }

    @Override
    public void doReceipt() {
        System.out.println("doReceipt method in StoreOrder");
    }

    @Override
    public void doDelivery() {
        System.out.println("doDelivery method in StoreOrder");
    }
}
