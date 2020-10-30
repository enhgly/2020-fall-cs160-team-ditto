package com.grouped.grouped.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grouped.grouped.model.Post;
import com.grouped.grouped.service.PostService;


@RequestMapping("/grouped")
@RestController
public class PostController {
	
	private final PostService postService;
	
	@Autowired
	public PostController(PostService postService) {
		this.postService = postService; 
	}
	
	@PostMapping(value = "/post")
	public void addPost(@Valid @RequestBody Post post) {
		postService.addPost(post);
	}
	
	@GetMapping(value = "/post")
	public List<Post> getAllPosts() { 
		return postService.getAllPosts();
	}
	
	@DeleteMapping(path = "/post/{id}")
	public void deletePostById(@PathVariable("id") Long id) {
		postService.deletePost(id);
	}

}
