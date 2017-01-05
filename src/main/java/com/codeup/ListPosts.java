package com.codeup;

import java.util.*;

import org.springframework.stereotype.Controller;

public class ListPosts implements Posts{

    private List<Post> posts;

    public ListPosts() {

        posts = new ArrayList<>();

    }

    @Override
    public Post create(Post post) {
        return null;
    }

    @Override
    public List<Post> all() {
        return posts;
    }
}
