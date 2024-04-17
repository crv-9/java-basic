package io.everyonecodes.java.t8_interfaces.exercises.set1.exercise4;

public class Batman implements Superhero{
    @Override
    public String getPrivateName() {
        return "Bruce Wayne";
    }

    @Override
    public String getSuperHeroName() {
        return "Batman";
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
