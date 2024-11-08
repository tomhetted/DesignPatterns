package org.example.generative.abstractfactory;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрики
        AnimalFactory catFactory = new CatFactory();
        AnimalFactory dogFactory = new DogFactory();

        // Создаем объекты через фабрики и вызываем их методы
        Animal cat = catFactory.createAnimal("Barsik", 2);
        Animal dog = dogFactory.createAnimal("Sharik", 3);

        cat.makeSound(); // Вывод: Meow!
        dog.makeSound(); // Вывод: Bark!
    }
}
