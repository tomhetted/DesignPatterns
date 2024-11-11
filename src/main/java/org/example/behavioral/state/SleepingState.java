package org.example.behavioral.state;

// Состояние "Спит"
public class SleepingState implements State {

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
