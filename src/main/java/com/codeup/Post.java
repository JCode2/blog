package com.codeup;

import java.util.Date;

/**
 * Created by joshua on 1/5/17.
 */
public class Post {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private int id;

    private String title;

    private String body;
}

    //private User = author;

   // private Date date = new Date();