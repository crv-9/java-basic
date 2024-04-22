package io.everyonecodes.java.t8_interfaces.reflection.service_classes;

import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Cutlery;
import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Fork;
import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Knife;
import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Spoon;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    static List<Cutlery> cutleryList = new ArrayList<>(List.of(
            new Spoon(), new Fork(), new Knife()
    ));
    public static List<String> getCutlery(String dishName){
        List<String> cutleryToBeUsed = new ArrayList<>();

        for (Cutlery cutlery: cutleryList) {
            if (cutlery.isUsedFor(dishName)){
                cutleryToBeUsed.add(cutlery.getName());
            }
        }

        return cutleryToBeUsed;
    }
}
