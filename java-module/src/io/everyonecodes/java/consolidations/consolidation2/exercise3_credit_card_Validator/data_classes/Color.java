package io.everyonecodes.java.consolidations.consolidation2.exercise3.data_classes;

public enum Color {
    RED("r"),
    GREEN("g"),
    YELLOW("y"),
    BLUE("b");

    private String letter;

    Color(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Color{" +
                "letter='" + letter + '\'' +
                '}';
    }
}
