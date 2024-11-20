package org.example.behavioral.templatemethod;

abstract class AnimalFeeding {

    public final void feedAnimal() {
        wakeUpAnimal();
        prepareFood();
        feed();
        cleanUp();
    }

    private void wakeUpAnimal() {
        System.out.println("Animal is waking up...");
    }

    private void cleanUp() {
        System.out.println("Cleaning up after feeding.");
    }

    protected abstract void prepareFood();
    protected abstract void feed();
}

// Конкретная реализация для кота
class CatFeeding extends AnimalFeeding {
    @Override
    protected void prepareFood() {
        System.out.println("Preparing cat food: opening a can of tuna.");
    }

    @Override
    protected void feed() {
        System.out.println("Feeding the cat: placing tuna in the bowl.");
    }
}

// Конкретная реализация для собаки
class DogFeeding extends AnimalFeeding {
    @Override
    protected void prepareFood() {
        System.out.println("Preparing dog food: pouring dry kibble.");
    }

    @Override
    protected void feed() {
        System.out.println("Feeding the dog: placing kibble in the bowl.");
    }
}