package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2.data_classes;

public class OilDrillPlatform extends Building{

    Drill drill;

    public OilDrillPlatform(String buildingID, String city, double totalCost, int constructionYear, Drill drill) {
        super(buildingID, city, totalCost, constructionYear);
        this.drill = drill;
    }

    public Drill getDrill() {
        return drill;
    }

    public void setDrill(Drill drill) {
        this.drill = drill;
    }
}
