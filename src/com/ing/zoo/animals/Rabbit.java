package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivore;

public class Rabbit implements Animal, Herbivore {

    public String name;
    public String helloText;
    public String eatText;

    public Rabbit() {
    }

    @Override
    public void sayHello() {
        helloText = "rabbit sounds";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch gimme more leaves";
        System.out.println(eatText);
    }
}
