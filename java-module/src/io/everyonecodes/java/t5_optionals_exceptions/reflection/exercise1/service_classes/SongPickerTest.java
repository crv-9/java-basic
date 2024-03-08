package io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1.service_classes;

import io.everyonecodes.java.t5_optionals_exceptions.reflection.exercise1.data_classes.Song;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SongPickerTest {
    SongPicker songPicker = new SongPicker();
    static Stream<Arguments> parameters_pickSong(){
        return Stream.of(
                Arguments.of(List.of(new Song("asd", 123, 1.0),new Song("asd", 234, 2.0)), 100, 300, 1.5, "asd")
//                Arguments.of()
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_pickSong")
    void pickSong(List<Song> list, int minDuration, int maxDuration, double minRating, String expected){
        Optional<Song> result = songPicker.pickSong(list, minDuration, maxDuration, minRating);

        assertTrue(result.isPresent());
        assertEquals(expected, result.get().getTitle());
    }


}
