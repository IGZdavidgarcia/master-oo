package com.oo.builder;

public class Vehicle {

    private String type;
    private String make;
    private String model;
    private String color;
    private int price;
    private int horsePower;
    private int doors;

    private Vehicle( Builder builder ) {

        this.type = builder.type;
        this.make = builder.make;
        this.model = builder.model;
        this.color = builder.color;
        this.price = builder.price;
        this.horsePower = builder.horsePower;
        this.doors = builder.doors;
    }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", horsePower=" + horsePower +
                ", doors=" + doors +
                '}';
    }

    public static class Builder {

        private String type;
        private String make;
        private String model;
        private String color;
        private int price;
        private int horsePower;
        private int doors;

        public Builder type( String value ) {
            this.type = value;
            return this;
        }

        public Builder make( String value ) {
            this.make = value;
            return this;
        }

        public Builder model( String value ) {
            this.model = value;
            return this;
        }

        public Builder color( String value ) {
            this.color = value;
            return this;
        }

        public Builder price( int value ) {
            this.price = value;
            return this;
        }

        public Builder horsePower( int value ) {
            this.horsePower = value;
            return this;
        }

        public Builder doors( int value ) {
            this.doors = value;
            return this;
        }

        public Vehicle build() {
            return new Vehicle( this );
        }
    }

}
