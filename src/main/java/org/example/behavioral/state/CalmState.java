package org.example.behavioral.state;

// Состояние "Спокойный"
public class CalmState implements State {

    @Override
    public void reactToTouch(Cat cat) {
        System.out.println("Кот мурлычет...");
        cat.setState(new PlayfulState()); // Меняем состояние на игривое
    }
}
