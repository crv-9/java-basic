package io.everyonecodes.java.t7b_datastructures.exercises.mixed.exercise2.data_classes;

public enum Weather {
    SUNNY("sunny"),
    CLOUDY("cloudy"),
    RAINY("rainy"),
    SNOWY("snowy"),
    STORMY("stormy");

    private String name;
    Weather(String name){this.name = name;}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "name='" + name + '\'' +
                '}';
    }
}
