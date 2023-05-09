package com.ing.zoo;

import com.ing.zoo.animals.*;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zoo {
    public static void main(String[] args) {
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
        Rabbit tyler = new Rabbit();
        tyler.name = "tyler";
        Dog max = new Dog();
        max.name = "max";

        // Maak van de dieren een lijst, zodat je ze makkelijk allemaal tegelijk kan aanspreken.
        Set<Animal> animals = new HashSet<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        animals.add(tyler);
        animals.add(max);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        switch (input) {
            case "hello":
                for (Animal animal : animals) {
                    animal.sayHello(); // Roep sayHello voor elk dier aan.
                }
                break;
            case "give leaves":
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves(); // Roep eatLeaves voor elk dier aan dat Herbivore is.
                    }
                }
                break;
            case "give meat":
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat(); // Roep eatMeat voor elk dier aan dat Carnivore is.
                    }
                }
                break;
            case "perform trick":
                for (Animal animal : animals) {
                    if (animal instanceof Tiger) {
                        ((Tiger) animal).performTrick(); // Indien een Tiger, roep performTrick aan.
                    }
                    if (animal instanceof Pig) {
                        ((Pig) animal).performTrick(); // Doe hetzelfde voor de Pig.
                    }
                    if (animal instanceof Dog) {
                        ((Dog) animal).performTrick(); // Doe hetzelfde voor de Dog.
                    }
                }
                break;
            default:
                // Indien niet een van de commando's, check of het 'hello <naam>' is, en roep vervolgens sayHello
                // voor dit dier aan.
                if (input.split(" ")[0].equals("hello") && input.split(" ").length == 2) {
                    switch (input.split(" ")[1]) {
                        case "henk":
                            henk.sayHello();
                            break;
                        case "elsa":
                            elsa.sayHello();
                            break;
                        case "dora":
                            dora.sayHello();
                            break;
                        case "wally":
                            wally.sayHello();
                            break;
                        case "marty":
                            marty.sayHello();
                            break;
                        case "tyler":
                            tyler.sayHello();
                            break;
                        case "max":
                            max.sayHello();
                            break;
                        default:
                            System.out.println("Het volgende dier is niet gevonden: " + input);
                    }
                } else {
                    System.out.println("Unknown command: " + input);
                }
                break;
        }

    }
}
