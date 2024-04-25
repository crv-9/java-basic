package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2.data_classes;

public class ElectricDrill extends DrillPower{
    int amperage;
    int voltage;

    public ElectricDrill(String powerType, int amperage, int voltage) {
        super(powerType);
        this.amperage = amperage;
        this.voltage = voltage;
    }

    public int getAmperage() {
        return amperage;
    }

    public int getVoltage() {
        return voltage;
    }
}
