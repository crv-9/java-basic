package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes.Headpiece;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes.Outfit;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes.Socks;

import java.time.DayOfWeek;
import java.time.Month;

public class Drawer {
    public static Outfit getOutfitForTheDay(Month month, DayOfWeek day){

        return new Outfit(getSocks(day), getHeadpiece(month));

    }

    private static Socks getSocks(DayOfWeek day){
        // enhanced switch
        return switch (day){
            case MONDAY -> Socks.REDSOCKS;
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> Socks.YELLOWSOCKS;
            case SATURDAY, SUNDAY -> Socks.GREENSOCKS;
        };
    }
    private static Headpiece getHeadpiece(Month month){
        // enhanced switch, suggested by IntelliJ
        return switch (month) {
            case JANUARY, FEBRUARY, MARCH, APRIL, NOVEMBER, DECEMBER -> Headpiece.WARM;
            case MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER -> Headpiece.LIGHT;
        };

        // normal switch before IJ's suggestion.
//        switch (month){
//            case JANUARY, FEBRUARY, MARCH, APRIL, NOVEMBER, DECEMBER:
//                return Headpiece.LIGHT;
//            case MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER:
//                return Headpiece.WARM;
//        }
    }
}
