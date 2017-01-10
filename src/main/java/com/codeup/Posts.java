package com.codeup;

import java.util.List;

public interface Posts {


    List<Post> all();

    void save(Post post);
    // Post edit(Post post);

    Post showPost(int id);

//    Post showEdit(int id);

    void update(Post existingPost);
}



