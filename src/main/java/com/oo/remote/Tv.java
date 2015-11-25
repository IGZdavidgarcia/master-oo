package com.oo.remote;

public class Tv extends Device {

    public Tv( String name, DeviceStatus status ) {
        super( name, status );
        System.out.println("Tv engaged...");
    }

    @Override
    public void turnOn() {
        System.out.println("Tv turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv turned OFF");
    }
}
