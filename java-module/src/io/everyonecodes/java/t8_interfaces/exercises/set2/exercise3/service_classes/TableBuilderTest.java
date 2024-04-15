package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise3.service_classes;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise3.data_classes.Furniture;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableBuilderTest {
    TableBuilder builder = new TableBuilder();

    @Test
    void build(){
        Furniture table = new Furniture("table");

        List<String> result = builder.build(table).getParts();

        List<String> expected = List.of("Leg", "Leg", "Leg", "Leg", "Surface");

        assertEquals(expected, result);
    }
}
