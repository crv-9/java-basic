package io.everyonecodes.java.t5b_files.exercises.exercise3.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise3.data_classes.Song;

import java.util.List;
import java.util.Optional;

public class SpotifyDataParser {
    public static Optional<Song> parseLine(String line){
        int rank = 0;
        String title = "";
        String artist = "";

        List<String> songInfo = List.of(line.split(";", 4));

        rank = Integer.parseInt(songInfo.get(0));
        title = songInfo.get(1).substring(1, songInfo.get(1).length()-1);
        artist = songInfo.get(2).substring(1, songInfo.get(2).length()-1);

        try {
            return Optional.of(new Song(title, rank, artist));
        } catch (Exception e){
            return Optional.empty();
        }

    }

}
