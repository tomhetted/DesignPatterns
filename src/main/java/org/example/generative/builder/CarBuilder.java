package org.example.generative.builder;

public interface CarBuilder {

    CarBuilder addChassis();

    CarBuilder addBody();

    CarBuilder paint();

    CarBuilder addInterior();

    Car build();
}
