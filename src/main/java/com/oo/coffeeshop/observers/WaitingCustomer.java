package com.oo.coffeeshop.observers;

public interface WaitingCustomer {

    void orderReady( String preparedDrink );
    String getName();
    String getOrderedDrink();
}
