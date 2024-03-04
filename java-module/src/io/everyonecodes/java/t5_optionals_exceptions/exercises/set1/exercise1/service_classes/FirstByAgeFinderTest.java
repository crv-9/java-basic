package io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise1.service_classes;

import io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise1.data_classes.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstByAgeFinderTest {
    FirstByAgeFinder firstByAgeFinder = new FirstByAgeFinder();
    static Stream<Arguments> parameters_find(){
        return Stream.of(
                Arguments.of(List.of(new Person("Carlos", 9), new Person("Ali", 10)), 9, new Person("Carlos",9)),
                Arguments.of(List.of(new Person("Carlos", 9), new Person("Ali", 9)), 9, new Person("Carlos", 9))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_find")
    void find(List<Person> inputList, int age, Person expected){
        Optional<Person> oResult = firstByAgeFinder.find(inputList, age);

        assertTrue(oResult.isPresent());
    }

    static Stream<Arguments> parameters_find2(){
        return Stream.of(
                Arguments.of(List.of(new Person("Carlos", 9), new Person("Ali", 10)), 15),
                Arguments.of(List.of(new Person("Carlos", 9), new Person("Ali", 9)), 12)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_find2")
    void findNoResult(List<Person> inputList, int age){
        Optional<Person> oResult = firstByAgeFinder.find(inputList, age);

        assertTrue(oResult.isEmpty());
    }
}
