package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise2.data_classes;

import java.util.Objects;

public class Outfit {
    Socks socks;
    Headpiece headpiece;

    public Outfit(Socks socks, Headpiece headpiece) {
        this.socks = socks;
        this.headpiece = headpiece;
    }

    public String getDescription(){
        return "a " + headpiece.getDescription() + " and " + socks.getDescription();
    }

    public Socks getSocks() {
        return socks;
    }

    public Headpiece getHeadpiece() {
        return headpiece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Outfit outfit = (Outfit) o;
        return socks == outfit.socks && headpiece == outfit.headpiece;
    }

    @Override
    public int hashCode() {
        return Objects.hash(socks, headpiece);
    }
}
