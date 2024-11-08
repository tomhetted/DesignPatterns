package org.example.generative.prototype;

public class Main {

    public static void main(String[] args) {
        Cat coon = new MainCoon("Barsik");
        Cat scottish = new ScottishFold("Pushok");

        Cat coonClone = coon.clone();
        coonClone.setName("Barsik the Second");

        Cat scottishClone = scottish.clone();
        scottishClone.setName("Pushok the Second");

        System.out.println(scottishClone.getName());
        System.out.println(coonClone.getName());
    }

}
