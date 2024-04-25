package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2.data_classes;

public class GasDrill extends DrillPower {

    int maxPressure;

    public GasDrill(String powerType, int maxPressure) {
        super(powerType);
        this.maxPressure = maxPressure;
    }

    public int getMaxPressure() {
        return maxPressure;
    }
}
