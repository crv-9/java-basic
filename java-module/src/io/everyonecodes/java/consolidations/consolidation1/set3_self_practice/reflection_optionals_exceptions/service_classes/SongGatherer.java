package io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.service_classes;


import io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.data_classes.NewSong;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SongGatherer {

    public static List<NewSong> gatherNewSongList(){
        List<NewSong> songList = new ArrayList<>(List.of());

        boolean shouldGetMoreSongs = true;

        while (shouldGetMoreSongs){
            songList.add(getSong());
            System.out.println("Add another song?");
            shouldGetMoreSongs = shouldContinue("Please enter 'true' or 'false");

        }
        return songList;
    }

    private static NewSong getSong(){

        String title = "";
        int duration = 0;
        double rating = 0.0;

        System.out.println("Please enter a song title.");
        title = getTitle();

        System.out.println("Please enter the song's duration in seconds:");
        duration = getDuration("this is not a valid duration. Please try again.");

        System.out.println("Please enter the song's rating, which should be between 1 and 5 stars. Decimals are allowed.");
        rating = getRating("This is not a valid rating. Please try again.");


        return new NewSong(title, duration, rating);

    }

    private static String getTitle(){
        Scanner userInput = new Scanner(System.in);
        String title = userInput.nextLine();

        return title;
    }

    private static int getDuration(String errorMessage){
        while(true){
            Scanner userInput = new Scanner(System.in);
            try{
                return userInput.nextInt();
            }catch (InputMismatchException ime){
                System.out.println(errorMessage);
            }
        }
    }

    private static double getRating(String errorMessage){
        while(true){
            Scanner userInput = new Scanner(System.in);
            try {
                return userInput.nextDouble();
            } catch (InputMismatchException ime){
                System.out.println(errorMessage);
            }
        }
    }

    private static  boolean shouldContinue(String errorMessage){
        while (true){
            Scanner userInput = new Scanner(System.in);

            try {
                return userInput.nextBoolean();
            } catch (InputMismatchException ime){
                System.out.println(errorMessage);
            }
        }
    }
}
