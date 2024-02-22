package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.service_classes;

import io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.data_classes.UserBMI;

public class BMICalculator {
    public static double calculateBMI(double height, double weight){
        return weight/((height * height)/10000.0);
    }

    public static String determineBMICategory(UserBMI userBMI){
        double bmi = calculateBMI(userBMI.getHeight(), userBMI.getWeight());

        String underweight = "That makes you underweight.";
        String normal = "You have a normal body weight.";
        String overweight = "You are overweight.";
        String obese = "Unfortunately, I have to tell you that you're obese.";


        if (bmi <= 18.5){
            userBMI.setBmiCategory(underweight);
            return underweight;
        } else if (bmi > 18.5 && bmi < 25) {
            userBMI.setBmiCategory(normal);
            return normal;
        } else if (bmi >= 25 && bmi < 30) {
            userBMI.setBmiCategory(overweight);
            return overweight;
        } else userBMI.setBmiCategory(obese);
            return obese;
    }
}
