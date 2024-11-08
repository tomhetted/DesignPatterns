package org.example.generative.abstractfactory;

public class DogFactory implements AnimalFactory{

    @Override
    public Animal createAnimal(String name, int age) {
        return new Dog(name, age);
    }
}
