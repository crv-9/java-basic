package io.everyonecodes.java.t7b_datastructures.reflection.data_classes;

public enum RPSLS_Options {
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors"),
    LIZARD("lizard"),
    SPOCK("spock");

    private String name;

    RPSLS_Options(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "RPSLS_Options{" +
                "name='" + name + '\'' +
                '}';
    }
}
