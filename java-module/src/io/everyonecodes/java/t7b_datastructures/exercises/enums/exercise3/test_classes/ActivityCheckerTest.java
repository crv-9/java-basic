package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise3.test_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise3.data_classes.Activity;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise3.data_classes.Weather;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise3.service_classes.ActivityChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ActivityCheckerTest {
    ActivityChecker checker = new ActivityChecker();

    @Test
    void checkActivityWeather1(){
        boolean result = checker.checkActivityWeather(Weather.CLOUDY, Activity.SAILING);
        assertFalse(result);
    }
    @Test
    void checkActivityWeather2(){
        boolean result = checker.checkActivityWeather(Weather.RAINY, Activity.SAILING);
        assertFalse(result);
    }
    @Test
    void checkActivityWeather3(){
        boolean result = checker.checkActivityWeather(Weather.SUNNY, Activity.SOCCER);
        assertTrue(result);
    }
    @Test
    void checkActivityWeather4(){
        boolean result = checker.checkActivityWeather(Weather.SNOWY, Activity.SKIING);
        assertTrue(result);
    }
    @Test
    void checkActivityWeather5(){
        boolean result = checker.checkActivityWeather(Weather.WINDY, Activity.SAILING);
        assertTrue(result);
    }
}
