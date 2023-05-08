package com.ing.zoo.animals;

import com.ing.zoo.Carnivore;
import com.ing.zoo.Herbivore;

import java.util.Random;

public class Pig implements Animal, Herbivore, Carnivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Pig() {
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
