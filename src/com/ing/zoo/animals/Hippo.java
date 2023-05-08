package com.ing.zoo.animals;

import com.ing.zoo.Herbivore;

public class Hippo implements Animal, Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo() {
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
