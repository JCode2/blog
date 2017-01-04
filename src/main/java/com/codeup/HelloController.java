package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by joshua on 1/4/17.
 */
@Controller
    class HelloController {

        @GetMapping("/hello/{name}")
        @ResponseBody
        public String hello(@PathVariable String name) {
            return "<h1>Hello, " + name + " from Spring!</h1>";
        }


        @GetMapping("increment/{number}")
        @ResponseBody
            public String increment(@PathVariable int number){
    return number + " plus 1  equals " + (number + 1) + ".";
        }
    }


