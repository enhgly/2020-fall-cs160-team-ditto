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
    public String profile(@RequestParam(required = false, defaultValue = "-1", value="id") Long id, @RequestParam(required = false, defaultValue = "-1", value="channel") Long channel) {
        return "profile";
    }    

    @GetMapping(value="/home")
    public String home(@RequestParam(required = false, defaultValue = "-1", value="id") Long id) {
        return "home";
    }
    
    @GetMapping(value="/party")
    public String event(@RequestParam(required = false, defaultValue = "-1", value="id") Long id, @RequestParam(required = false, defaultValue = "-1", value="channel") Long channel) {
        return "event";
    }   

    @GetMapping(value="/comment")
    public String comment(@RequestParam(required = false, defaultValue = "-1", value="id") Long id) {
        return "comment";
    }   

    @GetMapping(value="/groups")
    public String theName(@RequestParam(required = false, defaultValue = "-1", value="id") Long id) {
        return "groups";
    }

    @GetMapping(value="/group_channels")
    public String ch(@RequestParam(required = false, defaultValue = "-1", value="id") Long id, @RequestParam(required = false, defaultValue = "-1", value="id") Long group) {
        return "channels";
    }

    @GetMapping(value="/settings")
    public String settings() {
        return "settings";
    }

    /*@GetMapping(value="/event")
    public String profile(@RequestParam(required = false, defaultValue = "-1", value="id") Long id) {
        return "profile";
    }*/    
}