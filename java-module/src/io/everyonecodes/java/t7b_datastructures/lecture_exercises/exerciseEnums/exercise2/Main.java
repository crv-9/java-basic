package io.everyonecodes.java.t7b_datastructures.lecture_exercises.exerciseEnums.exercise2;

public class Main {
    public static void main(String[] args) {
        int temperature = 300;

        printCase(temperature);

    }

    public static void printCase(int temperature){
        int value;
        if (temperature<-200){
            value = 1;
        } else if (temperature<0) {
            value = 2;
        } else if (temperature==0) {
            value = 3;
        } else if (temperature>0 && temperature <200) {
            value =4;
        } else {value = 5;}


        switch (value) {
            case 1:
                System.out.println("superconducting!");
                break;
            case 2:
                System.out.println("freezing");
                break;
            case 3:
                System.out.println("cool");
                break;
            case 4:
                System.out.println("getting warmer");
                break;
            case 5:
                System.out.println("melting");
                break;
        }
    }
}
