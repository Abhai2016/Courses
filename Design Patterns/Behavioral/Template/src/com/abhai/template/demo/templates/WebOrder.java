package com.abhai.template.demo.templates;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("doCheckout method in WebOrder");
    }

    @Override
    public void doPayment() {
        System.out.println("doPayment method in WebOrder");
    }

    @Override
    public void doReceipt() {
        System.out.println("doReceipt method in WebOrder");
    }

    @Override
    public void doDelivery() {
        System.out.println("doDelivery method in WebOrder");
    }
}
