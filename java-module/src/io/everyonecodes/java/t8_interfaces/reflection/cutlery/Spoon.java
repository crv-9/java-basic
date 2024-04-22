package io.everyonecodes.java.t8_interfaces.reflection.cutlery;

import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Cutlery;

import java.util.List;

public class Spoon implements Cutlery {

    List<String> usedIn = List.of("soup");

    @Override
    public String getName() {
        return "Spoon";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return usedIn.contains(dishName.toLowerCase());
    }
}
