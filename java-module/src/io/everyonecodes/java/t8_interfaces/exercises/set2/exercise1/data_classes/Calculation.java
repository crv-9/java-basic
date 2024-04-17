package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise1.data_classes;

public class Calculation {
    String symbol;
    double number1;
    double number2;

    public Calculation(String symbol, double number1, double number2) {
        this.symbol = symbol;
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
