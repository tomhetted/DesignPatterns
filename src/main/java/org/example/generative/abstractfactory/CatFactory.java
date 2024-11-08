package org.example.generative.abstractfactory;

public class CatFactory implements AnimalFactory {

    @Override
    public Animal createAnimal(String name, int age) {
        return new Cat(name, age);
    }
}
