package io.everyonecodes.java.consolidations.consolidation1.set1.exercise3.data_classes;

public class Post {
    String title;
    String content;
    Date date;
    boolean isPublished;

    public Post(String title, String content, Date date, boolean isPublished) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.isPublished = isPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public boolean isPublished() {
        return isPublished;
    }
}
