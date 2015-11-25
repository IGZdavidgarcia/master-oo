package com.oo.remote;

public class RemoteController {

    private static Device selectedDevice;
    private static final RemoteController INSTANCE = new RemoteController();

    private RemoteController() {}

    public static RemoteController getInstance() {
        return INSTANCE;
    }

    public void chooseDevice( Device device ) {
        selectedDevice = device;
        System.out.println( "Device " + selectedDevice.getName() + " selected." );
    }

    public void turnDeviceOn() {
        selectedDevice.turnOn();
    }

    public void turnDeviceOff() {
        selectedDevice.turnOff();
    }
}
