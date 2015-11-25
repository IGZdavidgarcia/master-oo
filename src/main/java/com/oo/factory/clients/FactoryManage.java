package com.oo.factory.clients;

import com.oo.factory.processes.Laptop;
import com.oo.factory.processes.Mobile;
import com.oo.factory.processes.Product;

public class FactoryManage {

    public static void main( String[] args ) {

        Product laptop = new Laptop();
        Product mobile = new Mobile();

        laptop.manufacture();
        mobile.manufacture();

    }

}
