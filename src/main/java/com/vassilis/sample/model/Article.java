package com.vassilis.sample.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement(name="Article")
public class Article {
	private int id;

    public Article() {
    }

    public Article(int id) {
        this.id = id;
    }

    @XmlElement(name="author")
    private String author;

    @XmlElement(name="title")
    private String title;

    @XmlElement(name="numOfposts")
    private int numOfPosts;

    //private List<Comment> commentList = new ArrayList<Comment>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    public void setNumOfPosts(int numOfPosts) {
        this.numOfPosts = numOfPosts;
    }
}
