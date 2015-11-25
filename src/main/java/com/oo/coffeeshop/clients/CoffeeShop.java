package com.oo.coffeeshop.clients;

import com.oo.coffeeshop.managers.CoffeeAttendant;
import com.oo.coffeeshop.observers.Customer;

public class CoffeeShop {

    public static void main( String[] args ) {

        CoffeeAttendant attendant = new CoffeeAttendant();

        Customer customer = new Customer( "Dan", "Capuccino" );

        attendant.takeOrder( customer );
        attendant.prepareDrink( customer.getOrderedDrink() );

        customer = new Customer( "Alicia", "Moka" );
        attendant.takeOrder( customer );
        attendant.prepareDrink( customer.getOrderedDrink() );

        customer = new Customer( "Alfredo", "Latte" );
        attendant.takeOrder( customer );
        attendant.prepareDrink( customer.getOrderedDrink() );

        attendant.callOutCompletedOrders();
    }

}
