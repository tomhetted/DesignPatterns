package org.example.generative.factory;

public class AnimalFactory {

    public static Animal createAnimal (AnimalType type, String name, int age) {
        Animal animal = null;

        switch (type) {
            case CAT -> animal = new Cat(name, age);
            case DOG -> animal = new Dog(name, age);
        }

        return animal;
    }

    public static void main(String[] args) {
        createAnimal(AnimalType.DOG, "Sharik", 3).makeSound();
        createAnimal(AnimalType.CAT, "Barsik", 2).makeSound();
    }

}
