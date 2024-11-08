package org.example.generative.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Animal {

    private String name;
    private int age;

    public abstract void makeSound();

}
