package io.everyonecodes.java.t7b_datastructures.reflection.data_classes;

public enum Result {
    WON("You won!"),
    LOST("Computer won!"),
    DRAW("It's a draw!");

    private String name;

    Result(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Result{" +
                "name='" + name + '\'' +
                '}';
    }
}
