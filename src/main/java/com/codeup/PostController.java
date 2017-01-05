package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
/**
 * Created by joshua on 1/5/17.
 */
@Controller
@RequestMapping("/posts")
public class PostController {

        @GetMapping
        public String index(Model model) {
            List<Post> posts = DaoFactory.getPostsDao().all();
            model.addAttribute("posts", posts);
            return "posts/index";
        }

        @GetMapping("/create")
        public String showForm(Model model) {
            model.addAttribute("post", new Post());
            return "posts/create";
        }

        @PostMapping("/create")
        public String createPost(@ModelAttribute Post post) {
            DaoFactory.getPostsDao().create(post);
            return "redirect:/posts";
        }

    }

