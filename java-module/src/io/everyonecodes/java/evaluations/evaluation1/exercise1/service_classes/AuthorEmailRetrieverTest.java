package io.everyonecodes.java.evaluations.evaluation1.exercise1.service_classes;

import io.everyonecodes.java.evaluations.evaluation1.exercise1.data_classes.Comment;
import io.everyonecodes.java.evaluations.evaluation1.exercise1.data_classes.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorEmailRetrieverTest {

    AuthorEmailRetriever retriever = new AuthorEmailRetriever();

    @Test
    void retrieveNormal(){
        Comment newComment = new Comment("title", "my comment", new User("thisemail@email.com", "password") );
        String expected = "thisemail@email.com";

        String result = retriever.retrieve(newComment);

        assertEquals(expected, result);

    }
}
