package com.oo.remote;

public class Projector extends Device {

    public Projector( String name, DeviceStatus status ) {
        super( name, status );
        System.out.println("Projector engaged...");
    }

    @Override
    public void turnOn() {
        System.out.println("Projector turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Projector turned OFF");
    }
}
