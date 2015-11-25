package com.oo.builder;

public class App {

    public static void main( String[] args ) {

        Vehicle vehicle = new Vehicle.Builder()
                .type( "car" )
                .make( "Peugeot" )
                .model( "308" )
                .color( "red" )
                .doors( 4 )
                .horsePower( 250 )
                .price( 22500 )
                .build()
                ;

        System.out.println( vehicle.toString() );

    }

}
