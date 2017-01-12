package com.codeup;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by joshua on 1/12/17.
 */

public class UserController {

    @Autowired
   private Users usersDao;

    /*@Autowired
    private passwordEncoder passwordEncoder;*/



    @Autowired
    @GetMapping("/login")
    public String showLogin(){
        return "posts/login";
    }

    @Autowired
    @GetMapping("/register")
    public String showRegister(){
        return "posts/register";
    }

    @Autowired
    @PostMapping("/register")
    public String registered(){
        return "/posts";
    }
}

