package com.abhai.order_isp_violation;

public interface OrderService {
    // front-end methods

    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);

    // back-end method
    boolean processOrder(int orderId);

}
