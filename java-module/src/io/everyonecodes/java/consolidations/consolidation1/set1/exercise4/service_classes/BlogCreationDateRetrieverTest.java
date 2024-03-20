package io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Blog;
import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Date;
import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Post;
import io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.data_classes.Website;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlogCreationDateRetrieverTest {

    BlogCreationDateRetriever retriever = new BlogCreationDateRetriever();

    static Stream<Arguments> parameters_retrieve(){
        return Stream.of(
                Arguments.of(
                        new Website("firsturl.com", "firstcontent",

                                        new Blog("firstBlog",
                                                List.of(
                                                        new Post("1.1. Post", "1.1. Content", new Date(1, 1, 2000), true),
                                                        new Post("1.2. Post", "1.2. Content", new Date(1, 1, 2000), false),
                                                        new Post("1.3. Post", "1.3. Content", new Date(1, 1, 2000), true)
                                                ),
                                                new Date(1, 1, 2000)
                                        )

                        ), new Date(1,1, 2000)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_retrieve")
    void retrieveNormal(Website website, Date expected){

        assertTrue(retriever.retrieve(website).isPresent());
        Date result = retriever.retrieve(website).get();

        assertEquals(expected, result);

    }


    static Stream<Arguments> parameters_retrieveNoBlog(){
        return Stream.of(
                Arguments.of(
                        new Website("secondurl.com", "secondcontent")
                )
        );
    }


    @ParameterizedTest
    @MethodSource("parameters_retrieveNoBlog")
    void retrieveNoBlog(Website website){

        assertTrue(retriever.retrieve(website).isEmpty());
    }
}
