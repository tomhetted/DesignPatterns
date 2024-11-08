package org.example.behavioral.strategy;

public class Calculator {

    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.execute(a, b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AdditionStrategy());
        System.out.println("Addition: " + calculator.calculate(5, 3));

        calculator.setStrategy(new SubtractionStrategy());
        System.out.println("Subtraction: " + calculator.calculate(5, 3));

        calculator.setStrategy(new MultiplicationStrategy());
        System.out.println("Multiplication: " + calculator.calculate(5, 3));

        calculator.setStrategy(new DivisionStrategy());
        System.out.println("Division: " + calculator.calculate(10, 2));
    }
}
