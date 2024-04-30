package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.public_transport;

import java.util.List;

public class Subway extends PublicTransportVehicle{
    int numberOfWagons;

    public Subway(int maxPersonCapacity, List<Station> stationList, int numberOfWagons) {
        super(maxPersonCapacity, stationList);
        setMaxSpeed(110);
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    protected String otherVehicleStats() {
        return "Number of wagons: " + numberOfWagons;
    }

    @Override
    public String getVehicleDescription() {
        String string = "Subways are the best type of public transportation! Here are my stats:\n";

        string += super.getVehicleDescription();


        return string;
    }
}
