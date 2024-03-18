package io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.service_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Blog;
import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Post;

public class PublishedPostsCounter {
    public int count(Blog blog){
        int counter = 0;

        for (Post post: blog.getPosts()) {
            if (post.isPublished()){
                counter ++;
            }
        }
        return counter;
    }
}
