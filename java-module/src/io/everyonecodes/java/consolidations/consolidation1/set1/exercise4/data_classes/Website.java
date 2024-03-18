package io.everyonecodes.java.consolidations.consolidation1.set1.exercise4.data_classes;

import io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes.Blog;

import java.util.Optional;

public class Website {
    String url;
    String content;
    Optional<Blog> blog;

    public Website(String url, String content, Optional<Blog> blog) {
        this.url = url;
        this.content = content;
        this.blog = blog;
    }

    public Website(String url, String content) {
        this.url = url;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

    public Optional<Blog> getBlog() {
        return blog;
    }
}
