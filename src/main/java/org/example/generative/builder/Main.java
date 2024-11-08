package org.example.generative.builder;

public class Main {

    public static void main(String[] args) {
        CarBuilder builder = new SportCarBuilder();

        Car sportCar = builder.addChassis()
                .addBody()
                .paint()
                .addInterior()
                .build();

        if (sportCar != null) {
            System.out.println("Below car delievered: ");
            System.out.println("======================================================================");
            System.out.println(sportCar);
            System.out.println("======================================================================");
        }
    }
}
