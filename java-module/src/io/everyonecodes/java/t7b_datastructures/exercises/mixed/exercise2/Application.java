package io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise2;

import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise2.data_classes.Weather;
import io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise2.service_classes.WeatherRecorder;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        WeatherRecorder recorder = new WeatherRecorder();

        recorder.addRecord(LocalDate.of(2024,4,11), Weather.STORMY);
        recorder.addRecord(LocalDate.of(2024,4,10), Weather.CLOUDY);
        recorder.addRecord(LocalDate.of(2024,4,13), Weather.SUNNY);
        recorder.addRecord(LocalDate.of(2024,4,12), Weather.RAINY);
        recorder.addRecord(LocalDate.of(2024,4,14), Weather.SNOWY);

        recorder.printWeatherReport();
    }
}
