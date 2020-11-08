package com.grouped.grouped.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grouped.grouped.model.Comment;
import com.grouped.grouped.model.CommentRepo;
import com.grouped.grouped.service.CommentService;

@RequestMapping("comments")
@RestController
public class CommentController {
    private final CommentService commentService;
	
	@Autowired
	public CommentController(CommentService commentService) {
		this.commentService = commentService; 
	}
	
	@PostMapping(value = "/save")
	public void addComment(@Valid @NonNull @RequestBody Comment comment) {
		commentService.addComment(comment);
	}
	
	@GetMapping(value="/fetch")
	public List<Comment> getAllComment() { 
		return commentService.getAllComment();
    }
    
    @GetMapping(value="/retrieve_comments")
	public List<Comment> getByPostId(@RequestBody Comment comment) { 
		return commentService.getByPostId(comment.getPostId());
    }
}