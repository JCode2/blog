package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/posts")
public class PostController {

        @GetMapping
        public String index(Model model) {
//            List posts = DaoFactory.getPostsDao().all();
            model.addAttribute("posts", DaoFactory.getPostsDao().all());
            return "posts/index";
        }

        @GetMapping("/create")
        public String showForm(Model model) {
            model.addAttribute("post", new Post());
            return "posts/create";
        }

        @PostMapping("/create")
        public String createPost(@ModelAttribute Post posting) {
            DaoFactory.getPostsDao().save(posting);
            return "redirect:/posts";
        }

        @GetMapping("/view/{id}")
        public String postView(Model model,@PathVariable int id){
            model.addAttribute("post", DaoFactory.getPostsDao().showPost(id));
            return "posts/view";
        }

        @GetMapping("/{id}/edit")
        public String showEdit(Model model, @PathVariable int id){
        //TODO:use the passed id to find the record in the databas
            Post post = DaoFactory.getPostsDao().showEdit(id);
        // TODO: add to the modele
            model.addAttribute("post", post);
            return "posts/edit";
    }

        @PostMapping("/{id}/edit")
        public String update(@ModelAttribute Post editedPost, @PathVariable int id) {
        //  TODO:find the existing record in the database with the passed id
            Post existingPost = DaoFactory.getPostsDao().showPost(id);
        //  TODO: update the relevant fields
            String newTitle = editedPost.getTitle();
            String newBody = editedPost.getBody();
            existingPost.setTitle(newTitle);
            existingPost.setBody(newBody);
        //TODO: update the record in the database
            DaoFactory.getPostsDao().update(existingPost);
        return "redirect:/posts";
        }


        /*
         @GetMapping("/login")
        public String showLogin(Model model){
            model.addAttribute("login", new showLogin());
            return "posts/login";
        }

        @PostMapping("/login")
        public String login(@ModelAttribute )

        */
    }

