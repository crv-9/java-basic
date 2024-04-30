package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.public_transport;

public class Station {
    String name;
    double latitude;
    double longitude;

    public Station(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
