package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise1.data_classes;

import java.util.Objects;

public class TShirt {
    String color;
    TShirtSize size;
    Double price;

    public TShirt(String color, TShirtSize size, Double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TShirtSize getSize() {
        return size;
    }

    public void setSize(TShirtSize size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TShirt tShirt = (TShirt) o;
        return Objects.equals(color, tShirt.color) && size == tShirt.size && Objects.equals(price, tShirt.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size, price);
    }
}
