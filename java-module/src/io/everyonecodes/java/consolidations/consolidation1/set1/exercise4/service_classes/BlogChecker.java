package io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Blog;
import io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.data_classes.Website;

import java.util.Optional;

public class BlogChecker {
    public Optional<Blog> hasBlog(Website website){
        if (website.getBlog() == null){
            return Optional.empty();
        } else {return Optional.of(website.getBlog());}

    }
}
