package org.example.generative.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MainCoon implements Cat {

    private String name;

    @Override
    public Cat clone() {
        return new MainCoon(this.name);
    }
}
