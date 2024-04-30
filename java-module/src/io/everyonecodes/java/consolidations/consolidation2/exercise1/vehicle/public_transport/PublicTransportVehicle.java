package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.public_transport;

import io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.Vehicle;

import java.util.List;

public abstract class PublicTransportVehicle extends Vehicle {
    List<Station> stationList;

    public PublicTransportVehicle(int maxSpeed, int maxPersonCapacity, List<Station> stationList) {
        super(maxSpeed, maxPersonCapacity);
        this.stationList = stationList;
    }

    public PublicTransportVehicle(int maxPersonCapacity, List<Station> stationList) {
        super(maxPersonCapacity);
        this.stationList = stationList;
    }

    public PublicTransportVehicle(List<Station> stationList) {
        this.stationList = stationList;
    }

    protected abstract String otherVehicleStats();

    @Override
    public String getVehicleDescription() {
        StringBuilder stationsString = new StringBuilder();
        for (Station station: stationList) {
            stationsString.append("Station name: ").append(station.getName()).append(", Latitude: ").append(station.getLatitude()).append(", Longitude: ").append(station.getLongitude()).append("\n");
        }

        return super.getVehicleDescription() + "\n" + otherVehicleStats() +
                "\n ==Stations=="+
                "\n" + stationsString;
    }

}
