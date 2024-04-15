package io.everyonecodes.java.practice_coding_contest.rockpaperscissors.level1.data_classes;

import java.util.List;

public enum RPS_Options {
    ROCK("R", "S"),
    PAPER("P", "R"),
    SCISSORS("S", "P");

    private String name;
    private String defeats;

    RPS_Options(String name, String defeats) {
        this.name = name;
        this.defeats = defeats;
    }

    @Override
    public String toString() {
        return "RPS_Options{" +
                "name='" + name + '\'' +
                ", defeats='" + defeats + '\'' +
                '}';
    }
}
