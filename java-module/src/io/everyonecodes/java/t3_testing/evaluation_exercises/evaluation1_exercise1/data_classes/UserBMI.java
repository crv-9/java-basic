package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.data_classes;

public class UserBMI {
    String name;
    double height;
    double weight;
    String bmiCategory;

    public UserBMI(String name) {
        this.name = name;
    }

    public UserBMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBmiCategory() {
        return bmiCategory;
    }

    public void setBmiCategory(String bmiCategory) {
        this.bmiCategory = bmiCategory;
    }
}
