package com.grouped.grouped.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping(value="/profile")
    public String profile(@RequestParam(required = false, defaultValue = "-1", value="id") Long id) {
        return "profile";
    }    

    @GetMapping(value="/home")
    public String home(@RequestParam(required = false, defaultValue = "-1", value="id") Long id) {
        return "home";
    }   

    /*@GetMapping(value="/event")
    public String profile(@RequestParam(required = false, defaultValue = "-1", value="id") Long id) {
        return "profile";
    }*/    
}