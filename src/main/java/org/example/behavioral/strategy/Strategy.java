package org.example.behavioral.strategy;

public interface Strategy {

    int execute(int a, int b);
}

// Конкретная стратегия для сложения
class AdditionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

// Конкретная стратегия для вычитания
class SubtractionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

// Конкретная стратегия для умножения
class MultiplicationStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

// Конкретная стратегия для деления
class DivisionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}