package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1;

import io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes.*;
import io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.service_classes.AnimalFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnimalFinder animalFinder = new AnimalFinder();

        List<Animal> animalList = new ArrayList<>(List.of(
                new Fish("mahi", List.of("swim"), "salt"),
                new Reptile("rattle snake", List.of("slither", "swim"), false),
                new Mammal("dog", List.of("run", "jump"), "black"),
                new Amphibian("bullfrog", List.of("swim", "jump"), true),
                new Arthropod("black widow", List.of("walk"), 8),
                new Bird("owl", List.of("fly"), "brown")));


        List<Animal> flyingAnimals = animalFinder.findAnimalsWithMovement(animalList, "fly");

        for (Animal animal: flyingAnimals) {
            System.out.println(animal.getSpecies());
        }


    }


}
