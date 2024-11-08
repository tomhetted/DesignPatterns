package org.example.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw();

        Shape blueRectangle = new Rectangle(new BlueColor());
        blueRectangle.draw();

        Shape greenTriangle = new Triangle(new GreenColor());
        greenTriangle.draw();
    }
}
