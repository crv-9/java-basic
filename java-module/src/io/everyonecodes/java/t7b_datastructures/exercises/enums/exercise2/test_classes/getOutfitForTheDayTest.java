package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.test_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes.Headpiece;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes.Outfit;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes.Socks;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes.Drawer;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getOutfitForTheDayTest {

    Drawer drawer = new Drawer();

    @Test
    void getOutfitOfTheDay(){
        Outfit result = drawer.getOutfitForTheDay(Month.APRIL, DayOfWeek.FRIDAY);

        Outfit expected = new Outfit(Socks.YELLOWSOCKS, Headpiece.LIGHT);

        assertEquals(expected, result);
    }
}
