package org.example.behavioral.state;

public interface State {
    void reactToTouch(Cat cat);
}

// Состояние "Спокойный"
class CalmState implements State {

    @Override
    public void reactToTouch(Cat cat) {
        System.out.println("Кот мурлычет...");
        cat.setState(new PlayfulState()); // Меняем состояние на игривое
    }
}

// Состояние "Игривый"
class PlayfulState implements State {

    @Override
    public void reactToTouch(Cat cat) {
        System.out.println("Кот прыгает и играется!");
        cat.setState(new CalmState()); // Меняем состояние на спокойное
    }
}

// Состояние "Спит"
class SleepingState implements State {

    private int touchCount = 0;

    @Override
    public void reactToTouch(Cat cat) {
        System.out.println("Кот спит... Не трогать!");

        // Когда кот спит, мы не меняем его состояние, можно добавить логику для пробуждения
        // Например, после нескольких попыток прикосновения кот проснется и перейдет в состояние CalmState.

        touchCount++;
        if (touchCount == 5) {
            cat.wakeUp();
            touchCount = 0;
        }
    }
}

