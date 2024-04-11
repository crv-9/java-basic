package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.service_classes;


import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class MonthlyCalendar {
    public static Month askForMonth(){
        System.out.println("What month is it?");
        Scanner userInput = new Scanner(System.in);

        int monthInput = userInput.nextInt();

        return Month.of(monthInput);
    }
}
