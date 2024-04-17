package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise3.service_classes;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise3.data_classes.BuildingStep;
import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise3.data_classes.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TableBuilder {

    public Furniture build(Furniture furniture){
        List<BuildingStep> buildingStepsList = List.of(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddSurface());
        List<String> stringPartsList = new ArrayList<>();
        for (BuildingStep step: buildingStepsList) {
             stringPartsList.add(step.apply());
        }

        furniture.setParts(stringPartsList);

        return furniture;
    }
}
