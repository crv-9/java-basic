package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2.data_classes;

public class Drill {
    String drillTipMaterial;
    int drillSize;

    DrillPower powerType;


    public Drill(String drillTipMaterial, int drillSize, DrillPower powerType) {
        this.drillTipMaterial = drillTipMaterial;
        this.drillSize = drillSize;
        this.powerType = powerType;
    }

    public String getDrillTipMaterial() {
        return drillTipMaterial;
    }

    public int getDrillSize() {
        return drillSize;
    }

    public DrillPower getPowerType() {
        return powerType;
    }
}
