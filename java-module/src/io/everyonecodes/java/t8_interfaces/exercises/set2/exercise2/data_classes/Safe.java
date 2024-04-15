package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise2.data_classes;

public class Safe {
    int difficultyPoints;
    String securityLevel;

    public Safe(int difficultyPoints) {
        this.difficultyPoints = difficultyPoints;
    }

    public int getDifficultyPoints() {
        return difficultyPoints;
    }

    public void setDifficultyPoints(int difficultyPoints) {
        this.difficultyPoints = difficultyPoints;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }
}
