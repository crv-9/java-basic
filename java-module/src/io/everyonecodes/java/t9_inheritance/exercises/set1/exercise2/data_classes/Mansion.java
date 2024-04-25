package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2.data_classes;

public class Mansion extends Building{
    boolean hasJacuzzi;
    double gardenSize;

    public Mansion(String buildingID, String city, double totalCost, int constructionYear, boolean hasJacuzzi, double gardenSize) {
        super(buildingID, city, totalCost, constructionYear);
        this.hasJacuzzi = hasJacuzzi;
        this.gardenSize = gardenSize;
    }

    public boolean isHasJacuzzi() {
        return hasJacuzzi;
    }

    public double getGardenSize() {
        return gardenSize;
    }
}
