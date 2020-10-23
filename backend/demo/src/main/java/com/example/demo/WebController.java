package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class WebController {
  
    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }
}