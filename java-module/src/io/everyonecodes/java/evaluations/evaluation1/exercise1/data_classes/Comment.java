package io.everyonecodes.java.evaluations.evaluation1.exercise1.data_classes;

public class Comment {
    String title;
    String content;
    User author;

    public Comment(String title, String content, User author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }
}
