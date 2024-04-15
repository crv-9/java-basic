package io.everyonecodes.java.t8_interfaces.exercises.set1.exercise4;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SuperHeroCallerTest {
    SuperHeroCaller caller = new SuperHeroCaller();

    @Test
    void findSuperHeroExists(){
        String keyword = "peter";

        Optional<Superhero> result = caller.findSuperHero(keyword);

        assertTrue(result.isPresent());
        assertEquals(new Spiderman().getSuperHeroName(), result.get().getSuperHeroName());

    }

    @Test
    void findSuperHeroDoesntExist(){
        String keyword = "jbuio";

        Optional<Superhero> result = caller.findSuperHero(keyword);

        assertTrue(result.isEmpty());
    }
}
