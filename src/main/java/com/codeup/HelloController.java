package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

/**
 * Created by joshua on 1/4/17.
 */
@Controller
    class HelloController {
// now with tymeleaf. no need for pathvaribale and @responsebody anymore
        @GetMapping("/hello/{name}")
        public String hello(@PathVariable String name, Model model) {
            model.addAttribute("name", name);
            return "hello";
        }


        @GetMapping("increment/{number}")
        @ResponseBody
            public String increment(@PathVariable int number){
    return number + " plus 1  equals " + (number + 1) + ".";
        }
    }


