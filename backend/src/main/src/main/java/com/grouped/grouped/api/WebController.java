package com.grouped.grouped.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
  
    @GetMapping(value="/index")
    public String homepage(){
        return "index";
    }

    @GetMapping(value="/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping(value="/mainpage")
    public String mainpage() {
        return "main_profile";
    }
}