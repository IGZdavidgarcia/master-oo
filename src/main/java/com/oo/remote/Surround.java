package com.oo.remote;

public class Surround extends Device {

    public Surround( String name, DeviceStatus status ) {
        super( name, status );
        System.out.println("Surround engaged...");
    }

    @Override
    public void turnOn() {
        System.out.println("Surround turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Surround turned OFF");
    }
}
