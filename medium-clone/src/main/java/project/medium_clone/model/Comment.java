package project.medium_clone.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Comment {
    private int author;
    private String text;

    public Comment() {
        this.author = 0;
        this.text = "";
    }

    public Comment(int author, String text) {
        this.author = author;
        this.text = text;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "author=" + author +
                ", text='" + text + '\'' +
                '}';
    }
}
