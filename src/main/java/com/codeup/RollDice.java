package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class RollDice {

    @GetMapping("/roll-dice")

    public String rolldice(){
        return "Hello";
    }

    @GetMapping("/roll-dice/{n}")

    public String rolldice(@PathVariable int n, Model model){
        model.addAttribute("n", n);
        return "You guessed " + n;
    }

}




