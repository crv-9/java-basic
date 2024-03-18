package io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.data_classes.Website;

public class BlogChecker {
    public boolean hasBlog(Website website){
        try {
            if (website.getBlog().isPresent()){
                return true;
            } else {return false;}
        } catch (NullPointerException npe){
            return false;
        }


    }
}
