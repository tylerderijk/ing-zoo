package com.ing.zoo.animals;

import com.ing.zoo.Herbivore;

public class Zebra implements Animal, Herbivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra()
    {
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
