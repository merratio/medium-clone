package project.medium_clone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection="Article")
public class Article {
    @Id
    private String id;
    private String text;
    private String title;
    private String description;
    private String featureImg;
    private int claps;
    private int author;
    private List<Comment> comments;

    public Article() {
        this.text = "";
        this.title = "";
        this.description = "";
        this.featureImg = "";
        this.claps = 0;
        this.author = 0;
        this.comments = new ArrayList<>();
    }

    public Article(String text, String title, String description, String featureImg, int claps, int author, List<Comment> comments) {
        this.text = text;
        this.title = title;
        this.description = description;
        this.featureImg = featureImg;
        this.claps = claps;
        this.author = author;
        this.comments = comments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatureImg() {
        return featureImg;
    }

    public void setFeatureImg(String featureImg) {
        this.featureImg = featureImg;
    }

    public int getClaps() {
        return claps;
    }

    public void setClaps(int claps) {
        this.claps = claps;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
