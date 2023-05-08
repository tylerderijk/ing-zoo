package com.ing.zoo.animals;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivore;

public class Lion implements Animal, Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
    {
    }

    @Override
    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
