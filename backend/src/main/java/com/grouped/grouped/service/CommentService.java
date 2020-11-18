package com.grouped.grouped.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grouped.grouped.model.Comment;
import com.grouped.grouped.model.CommentRepo;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CommentService {
    @Autowired
    private CommentRepo commentRepo;

    public Long addComment(Comment comment) {
		return commentRepo.save(comment).getId();
	}
	
	public List<Comment> getAllComment(){
		List<Comment> comments = new ArrayList<Comment>();
		commentRepo.findAll().forEach(comments::add);
        return comments;
    }

    public List<Comment> getByPostId(@PathVariable("postId") Long postId) {
		return commentRepo.findByPostId(postId);
	}
}