package com.oo.factory.processes;

public class Mobile extends Product {

    @Override
    public void assemble() {
        System.out.println("Assembling mobile");
    }

    @Override
    public void test() {
        System.out.println("Testing mobile");
    }

    @Override
    public void pack() {
        System.out.println("Packaging mobile");
    }

    @Override
    public void store() {
        System.out.println("Storing mobile");
    }
}
