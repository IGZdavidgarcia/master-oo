package com.oo.factory.processes;

public class Laptop extends Product {

    @Override
    public void assemble() {
        System.out.println("Assembling laptop");
    }

    @Override
    public void test() {
        System.out.println("Testing laptop");
    }

    @Override
    public void pack() {
        System.out.println("Packaging laptop");
    }

    @Override
    public void store() {
        System.out.println("Storing laptop");
    }
}
