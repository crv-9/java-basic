package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise1.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataReaderTest {

    static Stream<Arguments> parameters_dataReader(){
        return Stream.of(
                Arguments.of(" first,second,third", new ArrayList<>(List.of("FIRST", "SECOND", "THIRD"))),
                Arguments.of("one,two,three ", new ArrayList<>(List.of("ONE", "TWO", "THREE"))),
                Arguments.of(" primero,segundo,tercero ", new ArrayList<>(List.of("PRIMERO", "SEGUNDO", "TERCERO"))),
                Arguments.of("erste,zweite,dritte", new ArrayList<>(List.of("ERSTE", "ZWEITE", "DRITTE")))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_dataReader")
    void stringConverter(String input, List<String> expected){
        DataReader dataReader = new DataReader();

        List<String> result = dataReader.stringConverter(input);

        assertEquals(expected, result);
    }
}
