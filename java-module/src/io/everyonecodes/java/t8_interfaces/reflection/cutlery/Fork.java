package io.everyonecodes.java.t8_interfaces.reflection.cutlery;

import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Cutlery;

import java.util.List;

public class Fork implements Cutlery {

    List<String> usedIn = List.of("fish", "pizza", "pasta");

    @Override
    public String getName() {
        return "Fork";
    }


    @Override
    public boolean isUsedFor(String dishName) {
        return usedIn.contains(dishName.toLowerCase());
    }
}
