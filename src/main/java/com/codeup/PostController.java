package com.codeup;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    Posts posts;

        @GetMapping
        public String index(Model model) {
//            List posts = DaoFactory.getPostsDao().all();
            model.addAttribute("posts", posts.findAll());
            return "posts/index";
        }

        @GetMapping("/create")
        public String showForm(Model model) {
            model.addAttribute("post", new Post());
            return "posts/create";
        }
//look here for validation
        @PostMapping("/create")
        public String createPost(@Valid Post post, Errors validation, @ModelAttribute Post posting, Model model) {
            if (validation.hasErrors()) {
                model.addAttribute("errors", validation);
                model.addAttribute("post", post);
                return "posts/create";
            }
            posts.save(posting);
            return "redirect:/posts";
        }

        @GetMapping("/{id}")
        public String postView(Model model,@PathVariable Long id){
            model.addAttribute("post", posts.findOne(id));
            return "posts/view";
        }

        @GetMapping("/{id}/edit")
        public String showEdit(Model model, @PathVariable Long id){
            Post post = posts.findOne(id);
            model.addAttribute("post", post);
            return "posts/edit";
    }

        @PostMapping("/{id}/edit")
        public String update(@ModelAttribute Post editedPost, @PathVariable long id) {
            Post existingPost = posts.findOne(editedPost.getId());
            String newTitle = editedPost.getTitle();
            String newBody = editedPost.getBody();
            existingPost.setTitle(newTitle);
            existingPost.setBody(newBody);
            posts.save(existingPost);
        return "redirect:/posts/" + existingPost.getId();

        }

    @GetMapping("/{id}/delete")
    public String delete(@ModelAttribute Post editedPost, @PathVariable long id) {
        Post existingPost = posts.findOne(editedPost.getId());
        posts.delete(id);
        return "redirect:/posts";
    }


   /*@PostMapping("/register")
    public String registerComplete(){
       String username = editedPost.getTitle();
       String newBody = editedPost.getBody();
       existingPost.setTitle(newTitle);
       existingPost.setBody(newBody);
       return("/posts");
   }*/
    }

