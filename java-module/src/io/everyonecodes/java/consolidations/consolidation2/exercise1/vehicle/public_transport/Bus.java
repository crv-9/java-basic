package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.public_transport;

import java.util.List;

public class Bus extends PublicTransportVehicle{

    boolean hasOverheadLine;

    public Bus(List<Station> stationList, boolean hasOverheadLine) {
        super(stationList);
        setMaxPersonCapacity(50);
        setMaxSpeed(80);
        this.hasOverheadLine = hasOverheadLine;
    }



    @Override
    protected String otherVehicleStats() {
        return "Overhead Line: " + ((hasOverheadLine)? "Available":"Not available");
    }

    @Override
    public String getVehicleDescription() {
        String string = "I'm a bus. Here is some more information about me:\n";

        string += super.getVehicleDescription();

        return string;
    }
}
