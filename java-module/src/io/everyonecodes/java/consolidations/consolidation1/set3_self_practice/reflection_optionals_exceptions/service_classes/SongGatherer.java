package io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.service_classes;


import io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.data_classes.NewSong;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SongGatherer {

    public static List<NewSong> gatherNewSongList(){
        List<NewSong> songList = new ArrayList<>(List.of());

        System.out.println("Please enter a song title.");



        songList.add(getSong());

//        isContinue();

        return songList;
    }

    private static NewSong getSong(){

        String title = "";
        int duration = 0;
        double rating = 0.0;


        title = getTitle();

        try {
            System.out.println("Please enter the song's duration in seconds.");
            duration = getDuration();
        } catch (InputMismatchException ime){
            System.out.println("This is not a valid duration. Please try again.");
            duration = getDuration();
        }

        rating = getRating();


        return new NewSong(title, duration, rating);


    }

    private static String getTitle(){
        Scanner userInput = new Scanner(System.in);
        String title = userInput.nextLine();

        return title;
    }

    private static int getDuration(){
        Scanner userInput = new Scanner(System.in);
        int seconds = userInput.nextInt();

        return seconds;
    }

    private static double getRating(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the song's rating, which should be between 1 and 5 stars. Decimal numbers are allowed.");
        double rating = userInput.nextDouble();

        return rating;
    }

    private static  boolean isContinue(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Add another song?");
        boolean toContinue = userInput.nextBoolean();
        return toContinue;
    }
}
