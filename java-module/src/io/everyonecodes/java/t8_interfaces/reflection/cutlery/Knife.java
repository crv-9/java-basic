package io.everyonecodes.java.t8_interfaces.reflection.cutlery;

import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Cutlery;

import java.util.List;

public class Knife implements Cutlery {

    List<String> usedIn = List.of("fish", "pizza");

    @Override
    public String getName() {
        return "Knife";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return usedIn.contains(dishName.toLowerCase());
    }
}
