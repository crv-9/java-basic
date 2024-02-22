package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1;

import io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.data_classes.UserBMI;

import java.util.List;

import static io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.service_classes.BMICalculator.determineBMICategory;
import static io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.service_classes.GatherUserInfo.askUserInfo;

public class Main {
    public static void main(String[] args) {

        List<UserBMI> userBMIList = List.of(
                new UserBMI("Lisa"),
                new UserBMI("Joe")
        );

        for (UserBMI user: userBMIList) {
            askUserInfo(user);
            System.out.println(user.getBmiCategory());
        }

    }
}
