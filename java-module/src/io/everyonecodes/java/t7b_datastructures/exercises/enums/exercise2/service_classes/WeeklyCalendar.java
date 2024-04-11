package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes;


import java.time.DayOfWeek;
import java.util.Scanner;

public class WeeklyCalendar {
    public static DayOfWeek askForDayOfWeek(){
        System.out.println("What day of the week is it?");
        Scanner userInput = new Scanner(System.in);

        int weekday = userInput.nextInt();

        return DayOfWeek.of(weekday);
    }
}
