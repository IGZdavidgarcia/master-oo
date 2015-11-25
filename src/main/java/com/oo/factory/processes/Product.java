package com.oo.factory.processes;

abstract public class Product {

    abstract protected void assemble();
    abstract protected void test();
    abstract protected void pack();
    abstract protected void store();

    public void manufacture() {
        assemble();
        test();
        pack();
        store();
    }

}
