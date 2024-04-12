package io.everyonecodes.java.t7b_datastructures.reflection;

import io.everyonecodes.java.t7b_datastructures.reflection.service_classes.RPSLS_Admin;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Let's play rock, paper, scissors, lizard, spock!");
        System.out.println("choose one:");

        // scanner could be it's own service class if needed.
        RPSLS_Admin admin = new RPSLS_Admin();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        if (admin.checkCorrectInput(userInput)){
            System.out.println(admin.checkUserResult(userInput));
        } else System.out.println("wrong input, you don't seem to understand the game. game over.");
    }
}
