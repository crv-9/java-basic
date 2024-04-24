package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.service_classes;

import io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalFinder {
    public static List<Animal> findAnimalsWithMovement(List<Animal> animalList, String movementType){
        List<Animal> resultList = new ArrayList<>();

        for (Animal animal: animalList) {
            if (animal.getMovementTypes().contains(movementType)){
                resultList.add(animal);
            }
        }

        return resultList;
    }
}
