package org.example.behavioral.state;

public class Cat {
    private State state;

    public Cat() {
        state = new CalmState(); // Начальное состояние - спокойный
    }

    public void setState(State state) {
        this.state = state;
    }

    public void touch() {
        state.reactToTouch(this); // Делегируем реакцию текущему состоянию
    }

    public void sleep() {
        setState(new SleepingState()); // Меняем состояние на Спит
        System.out.println("Кот пошел спать...");
    }

    public void wakeUp() {
        setState(new CalmState()); // После пробуждения кот возвращается в состояние Спокойный
        System.out.println("Кот проснулся!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.touch(); // Кот мурлычет...
        cat.touch(); // Кот прыгает и играется!
        cat.touch(); // Кот мурлычет...

        // Переводим кота в состояние сна
        cat.sleep();

        // Кот спит... Не трогать!
        // Будим кота
        for (int i = 0; i < 5; i++) {
            cat.touch();
        }

        cat.touch(); // Кот мурлычет...
    }
}
