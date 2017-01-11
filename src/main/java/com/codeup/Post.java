package com.codeup;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by joshua on 1/5/17.
 */
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Post must have a title")
    @Size(min = 3, message = "A title must be at least 3 characters.")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Post must have a description")
    @Column(nullable = false)
    private String body;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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


}

    //private User = author;

   // private Date date = new Date();