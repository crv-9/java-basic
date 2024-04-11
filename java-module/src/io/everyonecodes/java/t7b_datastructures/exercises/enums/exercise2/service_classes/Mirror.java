package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes.Outfit;

import java.time.DayOfWeek;
import java.time.Month;

public class Mirror {
    public static void sayHowItLooks(DayOfWeek day, Month month, Outfit outfit){
        System.out.println("On a " + day.name() + " in " + month.name() + " John is wearing " + outfit.getDescription());
    }
}
