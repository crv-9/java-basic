package io.everyonecodes.java.t8_interfaces.exercises.set1.exercise4;

public class Spiderman implements Superhero{
    @Override
    public String getPrivateName() {
        return "Peter Parker";
    }

    @Override
    public String getSuperHeroName() {
        return "Spiderman";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
