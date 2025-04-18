package com.post.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.post.post.models.Posts;
import com.post.post.models.Users;
import com.post.post.repository.PostRepo;
import com.post.post.repository.UserRepo;

@Service
public class Services {
    @Autowired
    private PostRepo postRepo;
    @Autowired
    private UserRepo userRepo;

    public void cereatuser(Users user) {
        userRepo.save(user);
    }
    public void deleteUser() {
        userRepo.deleteAll();
    }
    
    public List<Posts> getPostsByUsername( String username) {
        return postRepo.findByUsername(username);
    }

    public Posts createPost(Posts post) {
        return postRepo.save(post);
    }
    
   
}
