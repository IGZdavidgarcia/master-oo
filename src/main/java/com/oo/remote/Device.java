package com.oo.remote;

abstract public class Device {

    private String name;
    private DeviceStatus status;

    public Device( String name, DeviceStatus status ) {
        super();
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
