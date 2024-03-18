package io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1.service_classes;

import io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1.data_classes.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongCollector {
    public static List<Song> collectSongs(){
        List<Song> songsList = new ArrayList<>(List.of());

        Scanner userInput = new Scanner(System.in);

        boolean addNewSong= true;
        do {
            System.out.println("Please enter a song title");
            String title = userInput.nextLine();

            System.out.println("Please enter a song title");
            int songDuration = userInput.nextInt();
            userInput.nextLine();

            System.out.println("Please enter the song's rating, which should be between 1 and 5 stars. " +
                    "Decimal numbers are allowed.");
            double rating = userInput.nextDouble();

            System.out.println("Add another song?");
            addNewSong = userInput.nextBoolean();

            songsList.add(new Song(title, songDuration, rating));

        } while (addNewSong);



        return new ArrayList<>(List.of());
    }
}
