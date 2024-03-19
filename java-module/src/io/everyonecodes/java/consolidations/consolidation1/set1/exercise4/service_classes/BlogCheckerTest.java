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

public class BlogCheckerTest {
    BlogChecker checker = new BlogChecker();
    static Stream<Arguments> parameters_hasBlog(){
        return Stream.of(
                Arguments.of(
                        new Website("firsturl.com", "firstcontent",
                                Optional.of(
                                        new Blog("firstBlog",
                                        List.of(
                                                new Post("1.1. Post", "1.1. Content", new Date(1, 1, 2000), true),
                                                new Post("1.2. Post", "1.2. Content", new Date(1, 1, 2000), false),
                                                new Post("1.3. Post", "1.3. Content", new Date(1, 1, 2000), true)
                                        ),
                                        new Date(1, 1, 2000)
                                        )
                                )
                        ), true
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_hasBlog")
    void hasBlogNormal(Website website, boolean expected) {
        boolean result = checker.hasBlog(website);

        assertEquals(expected, result);
    }
    static Stream<Arguments> parameters_hasNoBlog(){
        return Stream.of(
                Arguments.of(
                        new Website("secondurl.com", "secondcontent"),false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_hasNoBlog")
    void hasNoBlog(Website website, boolean expected) {
        boolean result = checker.hasBlog(website);

        assertEquals(expected, result);
    }

}