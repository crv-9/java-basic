package io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set3_self_practice.reflection_optionals_exceptions.data_classes.NewSong;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SongFinderTest {

    SongFinder finder = new SongFinder();
    static Stream<Arguments> parameters_findSong(){

        NewSong song1 = new NewSong("firstSong", 10, 3.5);
        NewSong song2 = new NewSong("secondSong", 20, 4.5);
        NewSong song3 = new NewSong("thirdSong", 30, 2.5);
        NewSong song4 = new NewSong("fourthSong", 40, 2.5);
        NewSong song5 = new NewSong("fifthSong", 50, 4.0);
        NewSong song6 = new NewSong("sixthSong", 60, 3.0);

        return Stream.of(
                Arguments.of(List.of(
                        song1, song2, song3
                ), 15, 25, 4.0, song2),
                Arguments.of(List.of(
                        song4, song5, song6
                ), 10, 45, 2.0, song4)

        );
    }

    @ParameterizedTest
    @MethodSource("parameters_findSong")
    void findSongNormal(List<NewSong> songList, int minDuration, int maxDuration, double minRating, NewSong expected){
        Optional<NewSong> result = finder.findSong(songList, minDuration, maxDuration, minRating);
        assertTrue(result.isPresent());
        assertEquals(expected, result.get());

    }
}
