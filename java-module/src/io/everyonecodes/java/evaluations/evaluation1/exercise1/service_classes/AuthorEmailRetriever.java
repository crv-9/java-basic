package io.everyonecodes.java.evaluations.evaluation1.exercise1.service_classes;

import io.everyonecodes.java.evaluations.evaluation1.exercise1.data_classes.Comment;

public class AuthorEmailRetriever {
    public static String retrieve(Comment inputComment){
        if (inputComment == null){
            return "";
        }
        return inputComment.getAuthor().getEmail();
    }
}
