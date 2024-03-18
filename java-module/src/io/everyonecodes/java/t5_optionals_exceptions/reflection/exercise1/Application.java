package io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1;

import io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1.data_classes.Song;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        collectSongs();
    }
    public static List<Song> collectSongs(){
        List<Song> songsList = new ArrayList<>(List.of());

        Scanner userInput = new Scanner(System.in);

        boolean addNewSong= true;
        do {
            String title;
            int songDuration;
            double rating;

            System.out.println("Please enter a song title");
            title = userInput.nextLine();

            boolean continueAskingDuration = true;
            System.out.println("Please enter the song's duration in seconds.");
            while (continueAskingDuration) {
                try {
                    songDuration = userInput.nextInt();
                    userInput.nextLine();
                    continueAskingDuration = false;
                } catch (InputMismatchException ime) {
                    System.out.println("This is not a valid duration. Please try again.");
                    userInput.nextLine();
                }
            }

//            boolean continueAskingRating = true;
//            System.out.println("Please enter the song's rating, which should be between 1 and 5 stars. " +
//                    "Decimal numbers are allowed.");
//            while(continueAskingRating) {
////                try {
//                    rating = userInput.nextDouble();
////                    userInput.nextLine();
//                    continueAskingDuration = false;
////                } catch (InputMismatchException ime) {
////                    System.out.println("This is not a valid rating. Please try again.");
////                    userInput.nextLine();
////                }
//            }

            rating = 4.0;

            boolean continueAskNewSong = true;
            System.out.println("Add another song?");
            while (continueAskNewSong) {
                try {
                    addNewSong = userInput.nextBoolean();
                    continueAskNewSong = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter 'true' or 'false'");
                    userInput.nextLine();
                }
            }
            userInput.nextLine();

//            songsList.add(new Song(title, songDuration, rating));
        // The songDureation variable is never updated if it is inside of the Try
        } while (addNewSong);



        return new ArrayList<>(List.of());
    }
}
