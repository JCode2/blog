package com.codeup;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by joshua on 1/12/17.
 */
@Controller
public class UserController {

    @Autowired
   private Users usersDao;

    /*@Autowired
    private passwordEncoder passwordEncoder;*/

    @GetMapping("/register")
    public String showRegister(){
        return "posts/register";
    }

    @PostMapping("/register")
    public String registered(){
        return "/posts";
    }
}

