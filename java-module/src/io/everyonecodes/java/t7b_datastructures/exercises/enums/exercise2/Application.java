package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2;

import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes.Outfit;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes.Drawer;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes.Mirror;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes.MonthlyCalendar;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes.WeeklyCalendar;

import java.time.DayOfWeek;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        DayOfWeek day = WeeklyCalendar.askForDayOfWeek();
        Month month = MonthlyCalendar.askForMonth();
        Outfit outfit = Drawer.getOutfitForTheDay(month, day);



        Mirror.sayHowItLooks(day, month, outfit);
    }
}
