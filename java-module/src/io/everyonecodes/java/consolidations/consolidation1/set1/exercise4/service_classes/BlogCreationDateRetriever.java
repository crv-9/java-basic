package io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Date;
import io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.data_classes.Website;

import java.util.Optional;

public class BlogCreationDateRetriever {
    BlogChecker checker = new BlogChecker();
    public Optional<Date> retrieve(Website website){

        if (checker.hasBlog(website).isPresent()){
            return Optional.of(website.getBlog().getDateCreated());
        } else {
            return Optional.empty();
        }
    }
}
