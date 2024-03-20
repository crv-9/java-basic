package io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Blog;
import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Date;
import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Post;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublishedPostsCounterTest {

    PublishedPostsCounter counter = new PublishedPostsCounter();

    static Stream<Arguments> parameters_count(){
        return Stream.of(
                Arguments.of(
                    new Blog("firstBlog",
                            List.of(
                                    new Post("1.1. Post", "1.1. Content", new Date(1,1,2000),true),
                                    new Post("1.2. Post", "1.2. Content", new Date(1,1,2000),false),
                                    new Post("1.3. Post", "1.3. Content", new Date(1,1,2000),true)
                            ),
                            new Date(1,1,2000)) , 2
                ),
                Arguments.of(
                    new Blog("secondBlog",
                            List.of(
                                    new Post("2.1. Post", "1.1. Content", new Date(1,1,2001),true),
                                    new Post("2.2. Post", "1.2. Content", new Date(1,1,2001),true),
                                    new Post("2.3. Post", "1.3. Content", new Date(1,1,2001),true)
                            ),
                            new Date(1,1,2001)) , 3
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_count")
    void countNormal(Blog blog, int expected){
        int result = counter.count(blog);

        assertEquals(expected, result);
    }
    static Stream<Arguments> parameters_countNone(){
        return Stream.of(
                Arguments.of(
                    new Blog("firstBlog",
                            List.of(
                                    new Post("1.1. Post", "1.1. Content", new Date(1,1,2000),false),
                                    new Post("1.2. Post", "1.2. Content", new Date(1,1,2000),false),
                                    new Post("1.3. Post", "1.3. Content", new Date(1,1,2000),false)
                            ),
                            new Date(1,1,2000)) , 0
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_countNone")
    void countNone(Blog blog, int expected){
        int result = counter.count(blog);

        assertEquals(expected, result);
    }
}
