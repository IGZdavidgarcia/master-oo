package com.oo.remote;

public class User {

    public static void main( String[] args ) {

        Device projector = new Projector( "Projector", DeviceStatus.ON );
        Device tv = new Tv( "Tv", DeviceStatus.OFF );
        Device surround = new Surround( "Surround", DeviceStatus.OFF );

        RemoteController remoteController = RemoteController.getInstance();

        remoteController.chooseDevice( projector );
        remoteController.turnDeviceOff();

        remoteController.chooseDevice( tv );
        remoteController.turnDeviceOn();

        remoteController.chooseDevice( surround );
        remoteController.turnDeviceOn();

        remoteController.chooseDevice( projector );
        remoteController.turnDeviceOn();

        remoteController.chooseDevice( tv );
        remoteController.turnDeviceOff();

        remoteController.chooseDevice( surround );
        remoteController.turnDeviceOff();

        remoteController.chooseDevice( projector );
        remoteController.turnDeviceOff();

    }

}
