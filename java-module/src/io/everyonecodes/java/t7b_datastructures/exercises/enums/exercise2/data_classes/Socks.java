package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes;

public enum Socks {
    GREENSOCKS("green socks with dots"),
    YELLOWSOCKS("yellow socks with colors"),
    REDSOCKS("red socks with stripes");

    private String description;

    Socks(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Socks{" +
                "description='" + description + '\'' +
                '}';
    }
}
