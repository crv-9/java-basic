package io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes;

import java.util.List;

public class Blog {
    String title;
    List<Post> posts;
    Date dateCreated;

    public Blog(String title, List<Post> posts, Date dateCreated) {
        this.title = title;
        this.posts = posts;
        this.dateCreated = dateCreated;
    }

    public String getTitle() {
        return title;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
