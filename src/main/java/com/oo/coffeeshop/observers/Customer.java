package com.oo.coffeeshop.observers;

public class Customer implements WaitingCustomer {

    private String name;
    private String orderedDrink;

    public Customer( String name, String orderedDrink ) {
        this.name = name;
        this.orderedDrink = orderedDrink;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOrderedDrink() {
        return orderedDrink;
    }

    @Override
    public void orderReady( String preparedDrink ) {
        if( preparedDrink.equals( orderedDrink ) ) {
            System.out.println("Customer " + getName() + " has its " + preparedDrink + " ready");
        }
    }
}
