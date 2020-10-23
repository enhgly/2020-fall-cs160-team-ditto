package com.example.demo;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class RestWebController {
 
  List<User> users = new ArrayList<User>();
 
  @GetMapping(value = "/all")
  public Response getResource() {
    Response response = new Response("Done", users);
    return response;
  }
 
  @PostMapping(value = "/save")
  public Response postUser(@RequestBody User user) {
    users.add(user);
    
    // Create Response Object
    Response response = new Response("Done", user);
    return response;
  }
}