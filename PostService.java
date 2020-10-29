package com.grouped.grouped.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grouped.grouped.model.Post;
import com.grouped.grouped.model.PostRepo;

@Service
public class PostService {
	

	@Autowired
	private PostRepo postRepo;
	
	public Long addPost(Post post) {
		return postRepo.save(post).getPostId();
	}
	

	public List<Post> getAllPosts(){
		List<Post> posts = new ArrayList<Post>();
		postRepo.findAll().forEach(posts::add);
        return posts;
    }

	public void deletePost(Long id) {
		postRepo.deleteById(id);
	}


	
}
