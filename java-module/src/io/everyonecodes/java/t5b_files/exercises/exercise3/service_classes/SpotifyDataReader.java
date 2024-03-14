package io.everyonecodes.java.t5b_files.exercises.exercise3.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise3.data_classes.Song;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SpotifyDataReader {
    public List<Song> read() throws IOException {
        String filePathString = "src/io/everyonecodes/java/t5b_files/exercises/exercises-files/spotify-top-50.csv";
        Path filePath = Path.of(filePathString);

        List<String> fileLines = getAllFileLines(filePath);

        // here i am ignoring the first line as it is the header
        return getAllSongs(fileLines.subList(1, fileLines.size()));
    }

    private List<String> getAllFileLines(Path filePath) throws IOException{
        return Files.readAllLines(filePath);
    }

    private List<Song> getAllSongs(List<String> fileLines){
        List<Song> songsList = new ArrayList<>(List.of());
        SpotifyDataParser parser = new SpotifyDataParser();

        for (String song: fileLines) {
            if (parser.parseLine(song).isPresent()) {
                songsList.add(parser.parseLine(song).get());
            }
        }
        return songsList;
    }


}
