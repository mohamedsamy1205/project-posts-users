package com.post.post.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.post.models.Posts;

public interface PostRepo extends JpaRepository<Posts, Long> {
    List<Posts> findByUsername(String name); // Assuming you have a userId field in your Posts entity
}
