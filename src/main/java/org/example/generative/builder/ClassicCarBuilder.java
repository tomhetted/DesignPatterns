package org.example.generative.builder;

public class ClassicCarBuilder implements CarBuilder{

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    @Override
    public CarBuilder addChassis() {
        System.out.println("Assembling chassis of the classical model");
        this.chassis = "Classic Chassis";
        return this;
    }

    @Override
    public CarBuilder addBody() {
        System.out.println("Assembling body of the classical model");
        this.body = "Classic Body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Painting body of the classical model");
        this.paint = "Classic White Paint";
        return this;
    }

    @Override
    public CarBuilder addInterior() {
        System.out.println("Setting up interior of the classical model");
        this.interior = "Classic interior";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Car assembly is incomplete. Can't deliver!");
        }
        return null;
    }
}
