package io.everyonecodes.java.t8_interfaces.exercises.set1.exercise4;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.service_classes.PublishedPostsCounter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class SuperHeroCaller {
    List<Superhero> superheroes = new ArrayList<>(List.of(new Batman(), new Superman(), new Spiderman()));
    // just to test on how to create the list in the constructor.
//    List<Superhero> sup1;
//
//    public SuperHeroCaller(){
//        this.sup1 = new ArrayList<>(superheroes);
//
//        sup1.add(new Batman());
//        sup1.add(new Superman());
//        sup1.add(new Batman());
//    }

    public Optional<Superhero> findSuperHero(String keyword){
        return superheroes.stream()
                .filter(superhero -> superhero.getPrivateName().toLowerCase().contains(keyword.toLowerCase()) || superhero.getSuperHeroName().toLowerCase().contains(keyword.toLowerCase()))
                .findFirst();
    }
}
