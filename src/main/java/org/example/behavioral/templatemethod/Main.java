package org.example.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        AnimalFeeding catFeeding = new CatFeeding();
        AnimalFeeding dogFeeding = new DogFeeding();

        System.out.println("Feeding the cat:");
        catFeeding.feedAnimal();

        System.out.println("\nFeeding the dog:");
        dogFeeding.feedAnimal();
    }
}
