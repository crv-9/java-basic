package io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise1.service_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise1.data_classes.TShirt;
import io.everyonecodes.java.t7b_datastructures.exercises.enums.exercise1.data_classes.TShirtSize;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/*
* Create the ShopAssistant class with the askForSize method that asks for the size and returns it as a TShirtSize enum.
* For converting from String to enum you can use the TShirtSize.valueOf method that each enum automatically has.
* When the user enters an invalid size, return an empty Optional.*/

/*Add a new private property to the ShopAssistant that is a List of TShirts. Add some instances to that list.*/

public class ShopAssistant {

    private static List<TShirt> tShirtList = new ArrayList<>();

    private static void addShirts(){
        tShirtList.add(new TShirt("blue", TShirtSize.L, 10.0));
        tShirtList.add(new TShirt("blue", TShirtSize.M, 10.0));
        tShirtList.add(new TShirt("green", TShirtSize.L, 12.0));
        tShirtList.add(new TShirt("green", TShirtSize.S, 12.0));
        tShirtList.add(new TShirt("red", TShirtSize.XS, 10.0));
        tShirtList.add(new TShirt("red", TShirtSize.S, 10.0));
        tShirtList.add(new TShirt("black", TShirtSize.M, 20.0));
        tShirtList.add(new TShirt("black", TShirtSize.XL, 20.0));
    }
    private static Optional<TShirtSize> askForSize(){
        System.out.println("What size do you have?");
        addShirts();
        Scanner userInput = new Scanner(System.in);

        try {
            String input = userInput.nextLine().toUpperCase();
            return Optional.of(TShirtSize.valueOf(input));
        } catch (Exception e){
            return Optional.empty();
        }
    }

    /*
    * Add the findShirtsThatFit method to the ShopAssistant class that receives a TShirtSize
    * and returns a list of shirts that have that size. If no shirt is available for that size, the list is empty.
     */

    private static List<TShirt> findShirtsThatFit(TShirtSize size){

        return tShirtList.stream().filter(tshirt-> tshirt.getSize().equals(size)).toList();
    }

    /*Add the dealWithCustomer method to the ShopAssistant class that uses the previously defined methods
    * to provide the interaction given below. Make only this method public, the others should be private.
    */

    public static void dealWithCustomer(){
        System.out.println("Welcome to everyone shops!");

        Optional<TShirtSize> size = askForSize();

        if (size.isEmpty()){
            System.out.println("Sorry, we don't have that size on offer!");
        } else {
            findShirtsThatFit(size.get())
                    .forEach(shirt -> System.out.println("We have a " + shirt.getColor() + " shirt for " + shirt.getPrice() + " euro."));

        }

    }

}
