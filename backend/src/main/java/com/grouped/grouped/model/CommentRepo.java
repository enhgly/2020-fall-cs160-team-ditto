package com.grouped.grouped.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment, Long>
{
    List<Comment> findByPostId(Long postId);
}
