package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise3.service_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise3.data_classes.Activity;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise3.data_classes.Weather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityChecker {
    private Map<Weather, List<Activity>> weatherActivityMap;
    public void WeatherActivityDataStore(){
        weatherActivityMap = new HashMap<>();

        weatherActivityMap.put(Weather.SUNNY, List.of(Activity.VIDEO_GAMES, Activity.SOCCER, Activity.HIKING));
        weatherActivityMap.put(Weather.CLOUDY, List.of(Activity.VIDEO_GAMES, Activity.SOCCER, Activity.HIKING));
        weatherActivityMap.put(Weather.RAINY, List.of(Activity.VIDEO_GAMES));
        weatherActivityMap.put(Weather.SNOWY, List.of(Activity.VIDEO_GAMES, Activity.SKIING));
        weatherActivityMap.put(Weather.WINDY, List.of(Activity.VIDEO_GAMES, Activity.SAILING, Activity.HIKING));
    }
    public boolean checkActivityWeather(Weather weather, Activity activity){
        WeatherActivityDataStore();
        return weatherActivityMap.get(weather).contains(activity);
    }
}
