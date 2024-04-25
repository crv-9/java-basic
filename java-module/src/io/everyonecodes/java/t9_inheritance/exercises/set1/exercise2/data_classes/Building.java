package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2.data_classes;

public abstract class Building {
    String buildingID;
    String city;
    double totalCost;
    int constructionYear;

    public Building(String buildingID, String city, double totalCost, int constructionYear) {
        this.buildingID = buildingID;
        this.city = city;
        this.totalCost = totalCost;
        this.constructionYear = constructionYear;
    }

    public String getBuildingID() {
        return buildingID;
    }

    public String getCity() {
        return city;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getConstructionYear() {
        return constructionYear;
    }
}
