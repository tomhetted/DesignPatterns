package org.example.behavioral.state;

// Состояние "Игривый"
public class PlayfulState implements State {

    @Override
    public void reactToTouch(Cat cat) {
        System.out.println("Кот прыгает и играется!");
        cat.setState(new CalmState()); // Меняем состояние на спокойное
    }
}
