package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.service_classes;

import io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise1.data_classes.UserBMI;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    static Stream<Arguments> parameters_calculateBMI() {
        return Stream.of(
                Arguments.of(165.8, 75.4, 27.428514887790453),
                Arguments.of(179.0, 64.6, 20.161667863050464)
                );
    }



    @ParameterizedTest
    @MethodSource("parameters_calculateBMI")

    void calculateBMI(double height, double weight,  double expected){

        BMICalculator bmiCalculator = new BMICalculator();

        double result = bmiCalculator.calculateBMI(height, weight);

        assertEquals(expected, result);
    }


    static Stream<Arguments> parameters_determineBMICategory() {
        return Stream.of(
                Arguments.of(new UserBMI("Lisa", 180, 50), "That makes you underweight."),
                Arguments.of(new UserBMI("Lisa", 180, 70), "You have a normal body weight."),
                Arguments.of(new UserBMI("Lisa", 180 , 90), "You are overweight."),
                Arguments.of(new UserBMI("Lisa", 180, 100), "Unfortunately, I have to tell you that you're obese.")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_determineBMICategory")

    void determineBMICategory(UserBMI userBMI, String expected){

        BMICalculator bmiCalculator = new BMICalculator();

        String result = bmiCalculator.determineBMICategory(userBMI);

        assertEquals(expected, result);

    }
}
