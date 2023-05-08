package com.ing.zoo.animals;

import java.util.Random;

public class Tiger implements Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger()
    {
    }

    @Override
    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
