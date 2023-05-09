package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivore;

import java.util.Random;

public class Dog implements Animal, Carnivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Dog() {
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom woof thx bro";
        System.out.println(eatText);
    }

    @Override
    public void sayHello() {
        helloText = "woof";
        System.out.println(helloText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps through a dog hoop";
        } else {
            trick = "fetches a random ball";
        }
        System.out.println(trick);
    }
}
