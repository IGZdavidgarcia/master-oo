package com.oo.coffeeshop.managers;

import com.oo.coffeeshop.observers.Customer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {

    private List<Customer> customers;
    private List<String> completedDrinks;

    public CoffeeAttendant() {

        customers = new ArrayList<>();
        completedDrinks = new ArrayList<>();

    }

    public void takeOrder( Customer newCustomer ) {

        System.out.println( "Taking order: " + newCustomer.getOrderedDrink() + " for " + newCustomer.getName() );
        customers.add( newCustomer );

    }

    public void prepareDrink( String drinkToBePrepared ) {

        double timeTaken = Math.random()* 5; // give value between 1 and 50
        try {
            Thread.sleep((long) (timeTaken)*1000);
            completedDrinks.add(drinkToBePrepared);
        } catch (InterruptedException e) {
            System.out.println(" for some reason, drink was not prepared..");
        }

    }

    public void callOutCompletedOrders() {

        for ( String readyDrink : completedDrinks ) {

            System.out.println( "Order up: " + readyDrink );

            for ( Customer customer : customers ) {
                customer.orderReady( readyDrink );
            }
        }

    }

}
