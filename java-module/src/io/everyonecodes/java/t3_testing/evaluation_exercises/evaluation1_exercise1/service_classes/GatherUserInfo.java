package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.service_classes;

import io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.data_classes.UserBMI;

import java.util.Scanner;

import static io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.service_classes.BMICalculator.determineBMICategory;

// How should I test this one?
// Can I test a service class that asks for user info and triggers another method?
public class GatherUserInfo {
    public static void askUserInfo(UserBMI userBMI){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi " + userBMI.getName() + ", could you please tell me your weight in kg?");
        userBMI.setWeight(userInput.nextDouble());

        System.out.println("Thank you, could you please tell me your height in cm?");
        userBMI.setHeight(userInput.nextDouble());

        determineBMICategory(userBMI);
    }
}
