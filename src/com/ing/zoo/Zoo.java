package com.ing.zoo;

import com.ing.zoo.animals.*;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        Set<Animal> animals = new HashSet<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        switch (input) {
            case"hello":
                for (Animal animal : animals) {
                    animal.sayHello();
                }
                break;
            case "give leaves":
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    }
                }
                break;
            case "give meat":
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat();
                    }
                }
            case "perform trick":
                for (Animal animal : animals) {
                    if (animal instanceof Tiger) {
                        ((Tiger) animal).performTrick();
                    }
                    if (animal instanceof Pig) {
                        ((Pig) animal).performTrick();
                    }
                }
            default:
                System.out.println("Unknown command: " + input);
        }
    }
}
