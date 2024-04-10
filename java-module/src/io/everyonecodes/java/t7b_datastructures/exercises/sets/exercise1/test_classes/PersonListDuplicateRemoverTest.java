package io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise1.test_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise1.data_classes.Person;
import io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise1.service_classes.PersonListDuplicateRemover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonListDuplicateRemoverTest {
    PersonListDuplicateRemover remover = new PersonListDuplicateRemover();

    @Test
    void remover(){
        List<Person> personList = new ArrayList<>(List.of(
                new Person("kevin", 2),
                new Person("sarah", 2),
                new Person("ali", 2),
                new Person("carlos", 2),
                new Person("kevin", 2),
                new Person("kevin", 3)
        ));

        List<Person> expectedList = new ArrayList<>(List.of(
                new Person("kevin", 2),
                new Person("sarah", 2),
                new Person("ali", 2),
                new Person("carlos", 2),
                new Person("kevin", 3)
        ));

        List<Person> result = remover.remove(personList);

        // for visualization purposes
        for (Person person: expectedList) {
            System.out.println(person.getName() + person.getAge());
        }
        System.out.println("----");
        for (Person person: result) {
            System.out.println(person.getName() + person.getAge());
        }

        assertEquals(expectedList.size(), result.size());
        // here we are making a new set for both lists, and then we can compare items in both sets, regardless of their position
        assertEquals(new HashSet(expectedList), new HashSet<>(result));

    }
}
