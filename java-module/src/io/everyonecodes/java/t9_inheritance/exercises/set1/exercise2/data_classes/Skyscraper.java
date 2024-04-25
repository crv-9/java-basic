package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2.data_classes;

public class Skyscraper extends Building{

    boolean hasHeliPad;
    int amountOfElevators;

    public Skyscraper(String buildingID, String city, double totalCost, int constructionYear, boolean hasHeliPad, int amountOfElevators) {
        super(buildingID, city, totalCost, constructionYear);
        this.hasHeliPad = hasHeliPad;
        this.amountOfElevators = amountOfElevators;
    }

    public boolean isHasHeliPad() {
        return hasHeliPad;
    }

    public int getAmountOfElevators() {
        return amountOfElevators;
    }
}
