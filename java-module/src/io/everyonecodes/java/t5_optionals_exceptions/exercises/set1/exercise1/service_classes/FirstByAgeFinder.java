package io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise1.service_classes;

import io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise1.data_classes.Person;

import java.util.List;
import java.util.Optional;

public class FirstByAgeFinder {
    public static Optional<Person> find(List<Person> personList, int age){
        for (Person person: personList) {
            if (person.getAge() == age){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
