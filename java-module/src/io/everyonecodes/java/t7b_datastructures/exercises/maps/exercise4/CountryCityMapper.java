package io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise4;

import java.util.HashMap;
import java.util.Map;

/*
* Add the method addCityToCountry that takes the name of a country and the name of a city
* and stores it in some way internally using maps (it is up to you to come up with a good way to store it!).
* */

/*
* Add the method printCities that takes the name of a country and prints all of the corresponding cities for that country.
* If there are no corresponding cities for that country, it should print a message saying so instead of just printing nothing.
* */

public class CountryCityMapper {

    private Map<String, String> citiesAndCountries = new HashMap<>();

    public void addCityToCountry(String countryName, String cityName){
        citiesAndCountries.put(cityName, countryName);
    }

    public void printCities(String countryInput){

            if (citiesAndCountries.containsValue(countryInput)){
                System.out.println(countryInput + " has the following cities: ");
                citiesAndCountries.entrySet().stream()
                        .filter(pair->pair.getValue().equals(countryInput))
                        .forEach(pair -> System.out.println(pair.getKey()));
            } else {
                System.out.println("It seems that "+ countryInput + " doesn't have any cities");
            }

    }
}
