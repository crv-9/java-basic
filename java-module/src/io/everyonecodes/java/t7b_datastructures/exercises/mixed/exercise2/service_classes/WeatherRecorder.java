package io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise2.service_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise2.data_classes.Weather;

import java.time.LocalDate;
import java.util.*;

public class WeatherRecorder {

    private Map<LocalDate, Weather> dateWeatherMap = new HashMap<>();

    public void addRecord(LocalDate date, Weather weather){
        dateWeatherMap.put(date, weather);
    }

    public void printWeatherReport(){

        dateWeatherMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(pair-> System.out.println(pair.getKey() + ": the weather was " + pair.getValue().getName()));

    }
}
